FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY E:\Workspace\artifacts\helloworld-microservice-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/helloworld-microservice-1.0-SNAPSHOT.jar"]