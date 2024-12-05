## Setup Linux VM (Amazon Linux / Ubuntu)

1) Login into AWS Cloud account
2) Create Linux VM and connect to it using MobaXterm

## Execute Linux command to check VM is working fine

```
whoami
date
ls -l
clear
```

## Install Docker In Amazon Linux VM

```
sudo yum update -y 
sudo yum install docker -y
sudo service docker start
sudo usermod -aG docker ec2-user
exit
```
## Install Docker In Ubuntu VM

```
sudo apt update
curl -fsSL get.docker.com | /bin/bash
sudo usermod -aG docker ubuntu 
exit
```

## Verify docker installation

```
docker -v
docker info
clear
```

## Install Git

```
sudo yum install git
```

## Verify git installation

```
git -v
```

## Install Maven

```
sudo yum install maven
```

## Verify git installation

```
mvn -v
```

## Steps to run docker container

```
git clone <repo-url>
ls -l
//lets assume we got a repo with name microservices and this repo having 3 spring boot project like accounts, loans, cards
cd microservices
microservices:cd accounts
microservices/accounts: mvn clean install
//assume that already have dockerFile
microservices/accounts: docker build -t shaukatmakandar786/accounts:s4 .
microservices/accounts: docker images
microservices/accounts: docker run -d -p 8080:8080 shaukatmakandar786/accounts:s4
microservices/accounts: docker ps -a

---------------------------------------------------------------------------------
//assume that we are not having docker file so we are using google jib to create docker file. with this below mvn command it will create dockerFile as well as it will do build process
microservices/cards: mvn compile jib:dockerBuild
microservices/cards: docker images
microservices/cards: docker run -d -p 9000:9000 shaukatmakandar786/cards:s4
microservices/cards: docker ps -a

-----------------------------------------------------------------------------------

//assume that we are not having docker file so we are using google jib to create docker file. with this below mvn command it will create dockerFile as well as it will do build process
microservices/loans: mvn compile jib:dockerBuild
microservices/loans: docker images
microservices/loans: docker run -d -p 9000:9000 shaukatmakandar786/loans:s4
microservices/loans: docker ps -a
```

## Setup to Download Docker-Compose

```
sudo curl -L "https://github.com/docker/compose/releases/download/v2.19.1/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose
sudo chmod +x /usr/local/bin/docker-compose
docker-compose --version

```

## Steps to to run Docker-Compose file

```

First go to the location where u have created docker-compose.yml file for example we have create the this file in accounts folder

microservices/accounts: docker compose up -d
microservices/accounts: docker ps // to check all container are in ruuning mode or not
```
