FROM openjdk:11-jre-slim
COPY target/spring-boot-docker-1.0-SNAPSHOT.jar  /docker-app/spring-boot-docker-1.0-SNAPSHOT.jar
WORKDIR /docker-app
CMD ["java", "-jar", "spring-boot-docker-1.0-SNAPSHOT.jar"]