# Command to build the jar;
mvn clean install
mvn package

# command to build docker image;
docker build -t spring-boot-docker .

# command to run the docker image;
docker run -p 9090:8080 spring-boot-docker

## command to access the application;
http://localhost:9090

## command to view swagger
http://localhost:9090/swagger-ui.html

## access application via curl
curl -X GET http://localhost:9090
curl -X POST localhost:9090/account/detail -H 'Content-type:application/json' -d '{"searchAccountNumber":"acct1","region":"NAM"}'

## run in detach mode (in background)
docker run -p 9090:8080 -d spring-boot-docker
OR
docker run -p 9090:8080 -detatch spring-boot-docker

Docker can run your container in detached mode, that is in the background. 
To do this, we can use the --detach or -d for short. 
Docker will start your container the same as before but this time will “detach” from the container and return you to the terminal prompt.

anujmehra@Anujs-MacBook-Pro spring-boot-docker % docker run -p 9090:8080 -d spring-boot-docker
ec8f89af76ac0a6485e4187a204b50ee4e8435afdf70edd36b9a8b6ead692331
anujmehra@Anujs-MacBook-Pro spring-boot-docker % docker port ec8f89af76ac0a6485e4187a204b50ee4e8435afdf70edd36b9a8b6ead692331
8080/tcp -> 0.0.0.0:9090
8080/tcp -> :::9090


## what is container port: here 8080 is the container port -->
## what is local port: here 9090 is the local port --> 
## The left-hand side of the port number mapping is the Docker host port to map to and the right-hand side is the Docker container port number.

## stop the docker image
docker stop <container-id>