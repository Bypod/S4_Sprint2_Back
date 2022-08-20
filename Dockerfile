FROM openjdk:17.0.1-jdk-slim
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

ENV spring.datasource.url=jdbc:mysql://s4sprint2restapi.cbkweywzlhmm.us-east-1.rds.amazonaws.com/S4_Sprint_RestApi?enabledTLSProtocols=TLSv1.2
ENV spring.datasource.password=C0ding!sH!p21
ENV spring.datasource.username=root

ENTRYPOINT ["java","-jar","/app.jar"]