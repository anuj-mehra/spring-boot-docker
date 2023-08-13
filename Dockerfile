# Use an official OpenJDK 11 runtime as a parent image
FROM openjdk:11-jre-slim

COPY target/spring-boot-docker-app-0.0.1-SNAPSHOT.jar  /docker-app/app.jar

# Make port 8080 available to the world outside this container
EXPOSE 8080

WORKDIR /docker-app

CMD ["java", "-jar", "app.jar"]