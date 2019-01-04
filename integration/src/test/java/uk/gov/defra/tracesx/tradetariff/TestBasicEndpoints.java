package uk.gov.defra.tracesx.tradetariff;

import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
import org.junit.Before;
import org.junit.Test;
impott org.springframework.web.util.DefaultUriBuilderFactory;

public class TestBasicEndpoints {
  
  private String environmentBaseUrl;
  private String userName;
  private String password;
  
  private String stripEnvDelims(String src) {
    return src.substring(2, src.length() - 1);
  }
  
  @Before
  public void setup() {
    String scheme = System.getenv(stripEnvDelims("${TRADETARIFF_SCHEME}"));
    String host = System.getenv(stripEnvDelims("${TRADETARIFF_HOST}"));
    String port = System.getenv(stripEnvDelims("${TRADETARIFF_PORT}"));
    userName = System.getenv(stripEnvDelims("${TRADETARIFF_BASIC_AUTH_LOGIN}"));
    password = System.getenv(stripEnvDelims("${TRADETARIFF_BASIC_AUTH_PASSWORD}"));
    
    environmentBaseUrl = DefaultUriBuilderFactory.builder()
            .scheme(scheme).host(host).port(port).path("tradetariff").build().toString();
  }
  
  @Test
  public void canCreateDocument(){

    given()
      .auth().basic(userName, password)
      .body("{\"exampleName\": \"test\"}")
      .contentType(ContentType.JSON)
    .when()
      .post(environmentBaseUrl)
    .then().statusCode(201);
  }
  
  @Test
  public void rejectsInvalidDocument() {
    given()
      .auth().basic(userName, password)            
      .body("{\"exampleWrong\": \"test\"}")
      .contentType(ContentType.JSON)
    .when()
      .post(environmentBaseUrl)
    .then()
      .statusCode(400);
  }
  
   @Test
  public void canGetDocument() {

}
