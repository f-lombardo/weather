FROM openjdk:8-alpine

ENV pgmDir /opt/weather

RUN mkdir -p ${pgmDir}

COPY ./target/weather-0.0.1.jar ${pgmDir}
COPY ./config/application.properties ${pgmDir}

EXPOSE 8080/tcp

WORKDIR ${pgmDir}

ENTRYPOINT ["java", "-jar", "weather-0.0.1.jar"]
