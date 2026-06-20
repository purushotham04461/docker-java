FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY demo.java .

RUN javac demo.java

CMD ["java", "demo"]

#create a volume
#docker volume create volume-name
#docker volume ls
#docker inspect volume-name

#mount volume 
#docker run --name name --mount source=volume-name, target=/directory imagename:tag
