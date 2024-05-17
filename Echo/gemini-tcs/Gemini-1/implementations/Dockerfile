FROM openjdk:17
ARG JAR_FILE=build/libs/*.jar
COPY build/libs/demo-0.0.1-SNAPSHOT.jar app.jar
COPY lib/OCS.jar OCS.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]