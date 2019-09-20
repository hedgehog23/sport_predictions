FROM openjdk:11-jdk-slim
WORKDIR /usr/src/app
ARG JAR_FILE
COPY target/${JAR_FILE} ./app.jar
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=dev", "-Dspring.config.additional-location=/usr/src/app/config", "app.jar"]