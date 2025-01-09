# Use a base image
FROM openjdk:11-jre-slim

# Copy the application artifact
COPY build/libs/tutoring-app.jar /app.jar

# Expose the application port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "/app.jar"]

