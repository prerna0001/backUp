FROM openjdk:11-jdk-stretch

WORKDIR /src/app/api

ADD /target/spring-boot-zuulgatewayprosy-0.0.1-SNAPSHOT.jar /src/app/api/spring-boot-zuulgatewayprosy-0.0.1-SNAPSHOT.jar

ENTRYPOINT  ["java", "-jar","spring-boot-zuulgatewayprosy-0.0.1-SNAPSHOT.jar"]