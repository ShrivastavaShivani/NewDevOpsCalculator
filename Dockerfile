FROM openjdk:8-jre-alpine as target

RUN mkdir -p /opt/app
ENV Project_reside /opt/app

COPY target/Calculator-1.0-SNAPSHOT.jar $Project_reside/calc.jar

WORKDIR $Project_reside

EXPOSE 8082
ENTRYPOINT ["java", "-jar", "./calc.jar"]