# Use official OpenJDK base image
FROM eclipse-temurin:17-jdk

# Set working directory
WORKDIR /app

# Copy everything into the container
COPY . .

# Go into the actual Maven project folder (adjust if your repo name changes)
WORKDIR /app/WhatsApp_Chatbot

# Make Maven wrapper executable (in case Git didn't preserve it)
RUN chmod +x mvnw

# Build the Spring Boot project without running tests
RUN ./mvnw clean package -DskipTests

# Run the application
CMD ["java", "-jar", "target/*.jar"]
