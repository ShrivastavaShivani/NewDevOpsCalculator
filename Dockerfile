FROM openjdk:8
COPY target/Calculator-1.0-SNAPSHOT.jar Calculator-1.0-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/Calculator-1.0-SNAPSHOT.jar"]