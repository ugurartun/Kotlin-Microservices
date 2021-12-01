FROM openjdk:8-jdk-alpine
LABEL maintaner="ugurartun"
WORKDIR /app
COPY . /app
EXPOSE 8080
ADD ./target/demo-0.0.1-SNAPSHOT.jar demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]
