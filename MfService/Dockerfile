# Use official OpenJDK image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /home/runner/work/MFService/MFService/MfService/


# Copy the built JAR file into the container
COPY /MfService/target/*.jar app.jar

# Expose the port the application runs on
EXPOSE 8080

# Define the command to run the application
CMD ["java", "-jar", "app.jar"]
