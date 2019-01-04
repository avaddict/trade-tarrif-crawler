# Integration


This project is a standalone maven project for running automated integration tests.


- JRE / JDK 8
- Maven v3
- [Lombok Plugin](https://plugins.jetbrains.com/plugin/6317-lombok-plugin) (only required for development)


(Cent OS)

- If there is no existing JDK, download and install 
  [Java 8 JDK](http://www.oracle.com/technetwork/java/javase/install-linux-64-rpm-138254.html)



There are multiple VM options that need specifying to run the tests:

- `notification.service.base.url` is the url (including scheme and port) for the Notification Service
- `notification.auth.password` is basic auth password for entire notification service.
- `decision.service.base.url` is the url (including scheme and port) for the Decision Service
- `decision.auth.password` is the Basic auth password for the entire decision service
- `referencedata.service.base.url` is the url (including scheme and port) for the Reference Data Service
- `reference.auth.password` is basic auth password for entire reference data service.
- `soapsearch.service.base.url` is the url for the Soap Search Service
- `soapsearch.service.user1.password` is the Basic auth password for the one user of the soap service
- `soapsearch.service.user2.password` is the Basic auth password for a second user of the soap service
- `-P` is the test profile that ensures the proper test suite is run.
- `it.test` (optional) is the test runner that is used. Options: IntegrationTestRunner, WIPTestRunner
- `skip.integration.tests` should be `false` to run the tests. See notes in the Maven section below.


**FIXME**: they seem to be set using VM options

Passwords can be set from environment variables. For example, source `../docker-local/local_vars.sh`


See VM options section (above) for more details on VM options

- The test runners are located at `src/test/java/uk/gov/defra/tracesx/integration/runners`
- Run the test runners as a standard Java App (e.g. right click on the source file, Run IntegrationTestRunner)
- This should fail because of missing VM options
- Select the following:
  - Run / Edit Configurations
  - Under 'Name' - enter 'Integration Tests'
  - Add the 'VM Options'. See the sample below or the definitions above.
  - Click OK
- Re-run the test and it should now pass

Example VM Options for IntelliJ

    -Dskip.integration.tests=false
    -Dit.test=WIPTestRunner
    -Ddecision.service.base.url=http://import-notification-decision-service:4660
    -Dnotification.service.base.url=http://import-notification-notification-service:4560
    -Dreferencedata.service.base.url=http://import-notification-reference-data-service:4760
    -Dsoapsearch.service.base.url=http://import-notification-soap-search-service:4860
    -Dsoapsearch.service.user1.password=<PASSWORD>
    -Dsoapsearch.service.user2.password=<PASSWORD>
    -Dbasic.auth.password=<PASSWORD>
    -Dnotification.auth.password=<PASSWORD>
    -Dreference.auth.password=<PASSWORD>
    -Ddecision.auth.password=<PASSWORD>

Fill in the passwords from `docker-local/local_vars.sh` or your own configuration for these services.


It is common practice to modify the WIPTestRunner for this. Make sure not to push these changes.

**uk.gov.defra.tracesx.integration.runners.WIPTestRunner**

    ...
    tags = {"~@WIP", "@WIP-MYNAME}
    ...

**Feature File**

    @WIP-MYNAME
    Feature: The best feature
    
or

    @WIP-MYNAME
    Scneario: The best scenario


VM options can be passed into maven using `-D<PARAM>=<VALUE>`


Profiles are configured using the `-P` option e.g. `-P sanity`. The profiles determine which tests
are run. Please refer to the `pom.xml` to see the currently available profiles and their configurations.


The test runners in the `uk.gov.defra.tracesx.integration.runners` similarly control which tests are
run. You can specify a test runner on the command line using the `it.test` property e.g. 
`-Dit.test=SanityTestRunner`


Most of the profiles are setup to run tests in parallel. The number of parallel threads is controlled
by the `integration.test.parallel.count` property and can be overridden on the command line with
 `-Dintegration.test.parallel.count=10`

If the test runner (`it.test`) is specified at runtime then the tests will *not* run in parallel.


Running `mvn` from the project root `import-notification` will run the goal(s) on all modules.

**FIXME**: Is this not actually true? I don't see a parent in `pom.xml` and the performances tests don't

> **Note**: the `-Dskip.integration.tests=false` flag is required to actually run the integration 
tests. The integration test project is a module of the root project to ensure the project is built 
during the `mvn install` goal. The integration tests are excluded by default for the `install` goal.

    mvn clean install -Dskip.integration.tests=false -P sanity```

will run a build including integration tests (for full regression prior to push)


> **Tip**: run `$ source docker-local/local_vars.sh` to export environment variables that work with the
Docker images. You will need to run this for every terminal in which you want to use these variables.

    mvn clean verify -P regression -f ./integration/pom.xml \
    -Dskip.integration.tests=false \
    -Dit.test=IntegrationTestRunner \
    -Dnotification.service.base.url=http://${NOTIFICATION_SERVICE_HOST}:${NOTIFICATION_SERVICE_PORT} \
    -Dnotification.auth.password=${NOTIFICATION_SERVICE_BASIC_AUTH_PASSWORD} \
    -Ddecision.service.base.url=http://${DECISION_SERVICE_HOST}:${DECISION_SERVICE_PORT} \
    -Ddecision.auth.password=${DECISION_SERVICE_BASIC_AUTH_PASSWORD} \
    -Dreferencedata.service.base.url=http://${REFERENCE_DATA_SERVICE_HOST}:${REFERENCE_DATA_SERVICE_PORT} \
    -Dreference.auth.password=${REFERENCE_DATA_SERVICE_BASIC_AUTH_PASSWORD} \
    -Dsoapsearch.service.base.url=http://${SOAP_SEARCH_SERVICE_HOST}:${SOAP_SEARCH_SERVICE_PORT} \
    -Dsoapsearch.service.user1.password=Password1 \
    -Dsoapsearch.service.user2.password=Password2

**FIXME**: I cannot get the soap tests to pass using this command. Am I missing something or are they
just broken at the moment?

For the soapsearch passwords refer to `docker-local/docker-compose.yml`; these properties are not 
currently exported as environment variables.


> **NOTE**: To generate reports when running from your dev machine you also need to set the maven profile

Reports are generated on your dev machine using the [maven cucumber reporting](https://github.com/damianszczepanik/maven-cucumber-reporting) plugin provided the maven profile has been set.

    target/cucumber-reports/overview-features.html

Multiple JSON files are also created for use with [cucumber reports plugin](https://wiki.jenkins.io/display/JENKINS/Cucumber+Reports+Plugin)

The JSON files are in the following location:

    target/cucumber/
