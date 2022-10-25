FROM openjdk:8-jdk-alpine
ARG JARR_FILE=target/*.jar
COPY ${JARR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]