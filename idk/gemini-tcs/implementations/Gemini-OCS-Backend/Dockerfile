FROM openjdk:17
WORKDIR /app

COPY build/libs/gemini-ocs-0.0.1-SNAPSHOT.jar .
COPY references/images.txt references/
COPY references/liveview.txt references/
COPY ocs.mv.db .

EXPOSE 8080

CMD ["java", "-jar", "gemini-ocs-0.0.1-SNAPSHOT.jar"]
