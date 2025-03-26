FROM openjdk:21-jdk-slim

WORKDIR /app

RUN apt-get update && apt-get install -y maven

COPY pom.xml .
RUN mvn dependency:go-offline -B

COPY src /app/src

RUN mvn clean package

ENV JAVA_OPTS="-Xms512m -Xmx1024m"

EXPOSE 8081

CMD ["java", "-jar", "target/user-service-0.0.1-SNAPSHOT.jar"]