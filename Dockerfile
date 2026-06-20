FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY demo.java .

RUN javac demo.java

CMD ["java", "demo"]
