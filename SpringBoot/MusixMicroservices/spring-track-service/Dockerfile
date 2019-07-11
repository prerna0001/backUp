FROM openjdk:11-jdk-stretch

WORKDIR /src/app

ADD /target/muzixservice-0.0.1-SNAPSHOT.jar muzixservice-0.0.1-SNAPSHOT.jar

ENTRYPOINT  ["java", "-jar","muzixservice-0.0.1-SNAPSHOT.jar"]