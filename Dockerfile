# Use official OpenJDK base image
FROM eclipse-temurin:17-jdk

# Set working directory
WORKDIR /app

# Copy everything into the container
COPY . .

# Go into the correct subfolder (where your pom.xml is)
WORKDIR /app/WhatsApp_Chatbot

# Make mvnw executable
RUN chmod +x mvnw

# Build the Spring Boot project (skip tests)
RUN ./mvnw clean package -DskipTests

# Run the actual JAR
CMD ["java", "-jar", "target/WhatsApp_Chatbot-0.0.1-SNAPSHOT.jar"]
