FROM baseimagesrepo/java:1.8.0

RUN mkdir -p /usr/src/tradetariff-service
WORKDIR /usr/src/tradetariff-service

COPY target/TracesX_Tradetariff.jar /usr/src/tradetariff-service/
COPY lib/applicationinsights-agent-2.0.0.jar /usr/src/tradetariff-service/
COPY lib/AI-Agent.xml /usr/src/tradetariff-service/
EXPOSE ${TRADETARIFF_PORT}

CMD ["java", "-javaagent:/usr/src/tradetariff-service/applicationinsights-agent-2.0.0.jar", "-jar", "TracesX_Tradetariff.jar"]