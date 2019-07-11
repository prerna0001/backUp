FROM openjdk:11-jdk-stretch

ADD /target/spring-boot-zuulgatewayprosy-0.0.1-SNAPSHOT.jar /src/app/api/spring-boot-zuulgatewayprosy-0.0.1-SNAPSHOT.jar

WORKDIR /src/app/api

ENTRYPOINT  ["java", "-jar","spring-boot-zuulgatewayprosy-0.0.1-SNAPSHOT.jar"]