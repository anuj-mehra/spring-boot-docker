# Command to build the jar;
mvn clean install
mvn package

# command to build docker image;
docker build -t spring-boot-docker .

# command to run the docker image;
docker run -p 8080:8080 spring-boot-docker

# command to access the application;
http://localhost:8080
