# Tradetariff Microservice


Tradetariff Microservice is a SpringBoot RESTful service generated from the INS Microservice Maven archetype.
It was generated with the following parameters:

groupId = uk.gov.defra.tracesx
artifactId = tradetariff-microservice
- SERVICE_GET = true
- SERVICE_POST = true
- SERVICE_PATCH = true
- SERVICE_DELETE = true
- SERVICE_PORT = ${TRADETARIFF_PORT}
- PERSISTENCE = false
- SERVICE_DB_USER = ${TRADETARIFF_DB_USER}
- SERVICE_DB_PASSWORD = ${TRADETARIFF_DB_PASSWORD}
- CLIENT = true
- CLIENT_ENTITY = tradetariffClient
- CLIENT_GET = true
- CLIENT_POST = false
- CLIENT_PATCH = false
- CLIENT_DELETE = false
- PERMISSIONS = false


Tradetariff Microservice prerequisites



In order to run the service you will need the following dependencies

- JDK v1.8
- Maven v3


The service can be installed and run with:

```
./go
```


- See related instructions in `notification-service` for setting up Intellij
- Ensure that all environment variables are set correctly within the Intellij 'Run/Debug configuration'



Unit tests can be run with:

```
mvn clean test
```

The coverage report can be created with:

```
mvn clean test jacoco:report
```

The coverage report can then be viewed by opening the `target/site/jacoco/index.html` file in your browser.


See the 'integration' project for further details on how to run integration tests.


Please refer to [TracesX documentation](https://eaflood.atlassian.net/wiki/spaces/IM/pages/462356656/Docker+for+Local+Development).


The directory structure is laid out according to standard Maven project structure:


- `src/main/java` - Java source files
- `src/test/java` - Java unit test files



The root package for the Application.  Includes the Spring Boot Application.


- `src/main/resources` - resource files
- `src/test/resources` - unit test resource files


A custom configuration is created for use with Application Insights (the Azure centralised logging platform).
