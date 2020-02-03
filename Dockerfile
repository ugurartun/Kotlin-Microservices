FROM openjdk:8-jdk-alpine
LABEL maintaner="ugurartun"
VOLUME /tmp
EXPOSE 8080
ADD target/*.jar demo-0.0.1.jar
ENTRYPOINT ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]
