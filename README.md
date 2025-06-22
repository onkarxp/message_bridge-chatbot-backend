# WhatsApp Chatbot Backend

A Spring Boot backend service that acts like a basic WhatsApp chatbot.

## Features
- Accepts incoming messages via REST API (`/api/message`)
- Retrieves all messages (`/api/messages`)
- Stores messages in Firebase Firestore (with timestamps)
- Uses Bean validation (`@NotBlank`)
- Deployed on Render (containerized with Docker)

## Technologies
- Java 17
- Spring Boot
- Firebase Firestore
- Maven
- Render for cloud deployment

## Notes
- Firebase works fully in local dev environment.
- Render deployment currently faces Firebase credential loading issues due to environment setup.
- API tested successfully via Postman.
