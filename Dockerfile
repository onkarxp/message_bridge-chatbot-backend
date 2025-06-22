# Use official OpenJDK base image
FROM eclipse-temurin:17-jdk

# Set working directory
WORKDIR /app

# Copy everything into container
COPY . .

# Go into the correct subfolder
WORKDIR /app/WhatsApp_Chatbot

# Build using Maven Wrapper
RUN ./mvnw clean package

# Run the application
CMD ["java", "-jar", "target/*.jar"]
