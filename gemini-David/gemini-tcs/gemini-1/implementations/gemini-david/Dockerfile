# Use the official OpenJDK image as a base
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the packaged JAR file into the container
COPY build/libs/Gemini-David-6488154-0.0.1-SNAPSHOT-plain.jar /app/app.jar

# Expose the port that your app runs on
EXPOSE 8080

# Define the command to run your app using java -jar
CMD ["java", "-jar", "app.jar"]
