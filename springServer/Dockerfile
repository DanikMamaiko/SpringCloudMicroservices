FROM openjdk:17
ARG JAR_FILE=target/springServer-1.0-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
