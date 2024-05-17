FROM eclipse-temurin:17
EXPOSE 8080
EXPOSE 8080
VOLUME /tmp
COPY build/libs/*.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]