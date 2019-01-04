package uk.gov.defra.tracesx.tradetariff.security;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.List;
import javax.servlet.Filter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockFilterChain;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.mock.web.MockServletContext;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.web.FilterChainProxy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.intercept.DefaultFilterInvocationSecurityMetadataSource;
import org.springframework.security.web.access.intercept.FilterSecurityInterceptor;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.security.web.csrf.CsrfFilter;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class BasicAuthenticatorConfigIntegrationTest {
  
  AnnotationConfigWebApplicationContext context;

  MockHttpServletRequest request;
  MockHttpServletResponse response;
  MockFilterChain chain;

  @Autowired
  FilterChainProxy springSecurityFilterChain;

  @Before
  public void setup() {
    this.request = new MockHttpServletRequest("GET", "");
    this.request.setMethod("GET");
    this.response = new MockHttpServletResponse();
    this.chain = new MockFilterChain();
  }

  @After
  public void cleanup() {
      if (this.context != null) {
          this.context.close();
      }
  }
  
  @Test
  public void testRequestRequiresAuthorization() throws IOException, ServletException {
    //Given
    loadConfig(BasicAuthenticatorConfig.class);
    this.request.setServletPath("/");

    //When
    this.springSecurityFilterChain.doFilter(this.request, this.response, this.chain);

    //Then
    assertEquals(HttpServletResponse.SC_UNAUTHORIZED, this.response.getStatus());
  }

  @Test
  public void verifyBasicAuthFilterCoversAllPaths() throws Exception {
    //Given
    loadConfig(BasicAuthenticatorConfig.class);
    
    //When
    List<SecurityFilterChain> filterChain = this.springSecurityFilterChain.getFilterChains();
     
    //Then
    assertEquals("Should only be one filter chain in place", 1, filterChain.size());

    BasicAuthenticationFilter basicAuthenticationFilter = null;
    FilterSecurityInterceptor filterSecurityInterceptor = null;
    List<Filter> filters = filterChain.get(0).getFilters();
    for(Filter currentFilter: filters){
      if (currentFilter.getClass() == BasicAuthenticationFilter.class)
        basicAuthenticationFilter = (BasicAuthenticationFilter) currentFilter;
      if (currentFilter.getClass() == FilterSecurityInterceptor.class)
        filterSecurityInterceptor = (FilterSecurityInterceptor) currentFilter;
    }
    DefaultFilterInvocationSecurityMetadataSource filterSecurity = (DefaultFilterInvocationSecurityMetadataSource)filterSecurityInterceptor.getSecurityMetadataSource();
    Collection<ConfigAttribute> securityConfigurations = filterSecurity.getAllConfigAttributes();
    assertEquals("More than one security configuration set up", 1, securityConfigurations.size());
    assertEquals("Security configuration is not set to authenticated", "authenticated", securityConfigurations.toArray()[0].toString());
    assertNotNull("No basic auth filter found, basic auth is not configured", basicAuthenticationFilter);
    
    //WebExpressionConfigAttribute has a ticket with spring to be made public
    //in later release, at which point reflection can be removed
    ConfigAttribute activeSecurityConfig = (ConfigAttribute) (securityConfigurations.toArray()[0]);
    Field field = activeSecurityConfig.getClass().getDeclaredField("postProcessor");
    field.setAccessible(true);
    Object postProcessor = field.get(activeSecurityConfig); 
    assertNull("Basic auth should be on for all urls, so no postprocessor",postProcessor);
    
  }
  
  @Test
  public void csrfIsDisabled() throws IOException, ServletException {
    //Given
    loadConfig(BasicAuthenticatorConfig.class);

    //When
    List<SecurityFilterChain> filterChain = this.springSecurityFilterChain.getFilterChains();
     
    //Then
    assertEquals("Should only be one filter chain in place", 1, filterChain.size());

    List<Filter> filters = filterChain.get(0).getFilters();
    filters.stream().filter((currentFilter) -> (currentFilter.getClass() == CsrfFilter.class)).forEachOrdered((_item) -> {
      fail("CSRF Filter is present");
    });
  }
  
  //Check csrf off
  
  public void loadConfig(Class<?>... configs) {
		this.context = new AnnotationConfigWebApplicationContext();
		this.context.register(configs);
		this.context.setServletContext(new MockServletContext());
		this.context.refresh();
		this.context.getAutowireCapableBeanFactory().autowireBean(this);
	}
}
