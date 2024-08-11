# Use a base image with JDK 17
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the source code to the container
COPY build/libs/demo_cors_http-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your application will run on
EXPOSE 7777

# Run the Spring Boot application
CMD ["java", "-jar", "app.jar"]
