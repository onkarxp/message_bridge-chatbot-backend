# 💬Message-Bridge (WhatsApp) Chatbot Backend

A Spring Boot-based backend service that simulates the core functionality of a WhatsApp-style chatbot. This system is designed to receive and store messages via REST APIs and integrates with Firebase Firestore as its database.

---

## 🚀 Project Overview

This chatbot backend accepts user messages through an HTTP API, stores them securely in Firebase Firestore, and returns saved messages on request. It is designed with real-world scalability and modularity in mind — the same architecture can later be expanded to support actual WhatsApp Business APIs, NLP, or chatbot workflows.

---

## 🛠️ Tech Stack

| Layer        | Technology                        |
|--------------|------------------------------------|
| Language     | Java 17                            |
| Framework    | Spring Boot                        |
| Build Tool   | Maven                              |
| Database     | Firebase Firestore (NoSQL)         |
| Hosting      | Render (Dockerized)                |
| API Testing  | Postman                            |
| Version Ctrl | Git + GitHub                       |

---

## 📦 Features

- ✅ Accept user messages via a `POST /api/message` API
- ✅ Automatically assign timestamp (no need to send manually)
- ✅ Retrieve all messages via `GET /api/messages`
- ✅ Firebase Firestore integration for message storage
- ✅ Input validation using Jakarta Bean Validation
- ✅ Deployed using Docker on Render

---

## 📁 API Endpoints

### ➕ POST `/api/message`

Saves a user message.


## 📁 Project Structure

'''json
{
WhatsApp_Chatbot/
├── src/
│   └── main/
│       ├── java/com/chatbot/whatsappchatbot/
│       │   ├── controller/MessageController.java
│       │   ├── service/FirestoreService.java
│       │   ├── config/FirebaseInitializer.java
│       │   └── model/Message.java
│       └── resources/
│           └── application.properties
├── Dockerfile
├── render.yaml
├── pom.xml
└── README.md
}


#### ✅ Request Body:

```json
{
  "sender": "Onkar",
  "content": "Hello from the other side!"
}


