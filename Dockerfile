FROM cleanstart/jdk:26.0.1_p8-arm64

WORKDIR /app

COPY demo.java /app

RUN java demo.java

CMD ["java","demo.java"]
