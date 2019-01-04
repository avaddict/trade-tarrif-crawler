package uk.gov.defra.tracesx.tradetariff;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import java.util.HashSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
@EnableConfigurationProperties
public class TradetariffConfiguration {

  @Bean
  @Autowired
  public RestTemplate tradetariffClientRestTemplate(
          RestTemplateBuilder restTemplateBuilder,
          @Value("${tradetariff.client.connectionTimeout}") int connectionTimeout,
          @Value("${tradetariff.client.readTimeout}") int readTimeout
  ) {

    HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = 
            new HttpComponentsClientHttpRequestFactory();
    clientHttpRequestFactory.setConnectTimeout(connectionTimeout);
    clientHttpRequestFactory.setReadTimeout(readTimeout);

    return new RestTemplate(clientHttpRequestFactory);
  }

  @Bean(name = "tradetariffClientObjectMapper")
  public ObjectMapper tradetariffClientObjectMapper() {
    ObjectMapper objectMapper = new ObjectMapper();
    return objectMapper;
  }

  @Bean
  @Autowired
  public HashSet sectionSet(
          @Value("${tradetariff.sections}") String theSections) {
    return new HashSet(Arrays.asList(theSections.split(",")));
  }

  @Bean
  @Autowired
  public HashSet chapterSet(
          @Value("${tradetariff.chapters}") String theChapters) {
    return new HashSet(Arrays.asList(theChapters.split(",")));
  }

}
