# Use official OpenJDK base image
FROM eclipse-temurin:17-jdk

# Set working directory
WORKDIR /app

# Copy all project files
COPY . .

# Build using Maven Wrapper
RUN ./mvnw clean package

# Run the application
CMD ["java", "-jar", "target/*.jar"]
