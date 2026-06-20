FROM ubuntu

WORKDIR /app

COPY demo.java /app

RUN apt-get update

RUN apt-get install openjdk-17-jdk -y


CMD ["java","demo.java"]
