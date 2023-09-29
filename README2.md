#Docker commands
https://www.javainuse.com/spring/spring_eurekaregister2

docker --version

##view images on the system
docker images

##to remove a docker image
docker rmi <image-name>|<container-id>
docker rmi -f <image-name>

##only pull the image
docker pull <image-name>

##run an image
docker run docker/<image-name>

##show all running images;
docker ps

##show all images that ever ran;
docker ps -a

##following command will run the docker image;
docker run centos

##following command will run the docker image, and will get inside the image;
docker run -it centos bash

##command to stop a docker images;
docker stop <container-id>
docker stop <image-name>

##command to create a docker image;
docker build -t spring-boot-docker .

##where are docker images stored on the machine?;
