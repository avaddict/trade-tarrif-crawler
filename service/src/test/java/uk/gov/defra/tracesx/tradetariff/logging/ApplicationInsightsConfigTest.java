package uk.gov.defra.tracesx.tradetariff.logging;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.core.Ordered;
import org.springframework.core.env.Environment;

@RunWith(MockitoJUnitRunner.class)
public class ApplicationInsightsConfigTest {

  private static final String APPLICATION_INSIGHTS_IKEY = "APPLICATION_INSIGHTS_IKEY";
  private static final String APPLICATION_INSIGHTS_VALUE = "APPLICATION_INSIGHTS_VALUE";
  private static final String BLANK = "";
  @Mock private Environment environment;
  @InjectMocks private ApplicationInsightsConfig underTest;

  @Test
  public void whenEnvHasVariableSetThenTheResultContainsValue() {

    when(environment.getProperty(APPLICATION_INSIGHTS_IKEY)).thenReturn(APPLICATION_INSIGHTS_VALUE);
    String result = underTest.telemetryConfig();
    assertThat(result, is(APPLICATION_INSIGHTS_VALUE));
  }

  @Test
  public void whenEnvHasVariableSetToBlankThenTheResultDoesntContainValue() {

    when(environment.getProperty(APPLICATION_INSIGHTS_IKEY)).thenReturn(BLANK);
    String result = underTest.telemetryConfig();
    assertThat(result, is(BLANK));
  }

  @Test
  public void whenEnvHasVariableNotSetThenTheResultDoesntContainValue() {

    when(environment.getProperty(APPLICATION_INSIGHTS_IKEY)).thenReturn(null);
    String result = underTest.telemetryConfig();
    assertThat(result, is(nullValue()));
  }
  
  @Test
  public void filterRegistrationBeanHasCatchAllUrl() {
    //Given
    ApplicationInsightsConfig aiConfig = new ApplicationInsightsConfig();

    //When
    FilterRegistrationBean filterRegistration = aiConfig.aiFilterRegistration(APPLICATION_INSIGHTS_IKEY);
    
    //Then
    assertEquals(1, filterRegistration.getUrlPatterns().size());
    assertEquals("/*", filterRegistration.getUrlPatterns().iterator().next());
  }
  
  @Test
  public void filterRegistrationBeanHasHighOrder() {
    //Given
    ApplicationInsightsConfig aiConfig = new ApplicationInsightsConfig();

    //When
    FilterRegistrationBean filterRegistration = aiConfig.aiFilterRegistration(APPLICATION_INSIGHTS_IKEY);
    
    //Then
    assertEquals(Ordered.HIGHEST_PRECEDENCE + 10, filterRegistration.getOrder());
  }
}
