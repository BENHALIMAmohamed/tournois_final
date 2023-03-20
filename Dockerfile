# Use an official Maven image as a parent image
FROM maven:3.8.3-openjdk-11-slim

# Set the working directory to /app
WORKDIR /app

# Copy the current directory contents into the container at /app
COPY . /app

# Run Maven to build the application
RUN mvn clean package

# Expose port 8080 for the Spring Boot application to listen on
EXPOSE 8080

# Start the Spring Boot application when the container starts
ENTRYPOINT ["java", "-jar", "target/tournois-0.0.1-SNAPSHOT.jar"]
