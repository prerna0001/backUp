FROM openjdk:11-jdk-stretch

WORKDIR /src/app/userservice

ADD /target/userservice-0.0.1-SNAPSHOT.jar userservice-0.0.1-SNAPSHOT.jar

ENTRYPOINT  ["java", "-jar","userservice-0.0.1-SNAPSHOT.jar"]