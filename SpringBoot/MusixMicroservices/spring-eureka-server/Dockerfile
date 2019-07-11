FROM openjdk:11-jdk-stretch

WORKDIR /src/app

ADD /target/spring-eureka-server-0.0.1-SNAPSHOT.jar /src/app/spring-eureka-server-0.0.1-SNAPSHOT.jar

ENTRYPOINT  ["java", "-jar","spring-eureka-server-0.0.1-SNAPSHOT.jar"]