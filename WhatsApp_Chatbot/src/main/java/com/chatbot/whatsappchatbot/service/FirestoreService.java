package com.chatbot.whatsappchatbot.service;



import com.chatbot.whatsappchatbot.model.Message;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FirestoreService {

    private static final String COLLECTION_NAME = "messages";

    public String saveMessage(Message message) {
        try {
            Firestore db = FirestoreClient.getFirestore();

            Map<String, Object> data = new HashMap<>();
            data.put("sender", message.getSender());
            data.put("text", message.getText());
            data.put("timestamp", message.getTimestamp());

            ApiFuture<DocumentReference> result = db.collection("messages").add(data);
            return "✅ Message saved with ID: " + result.get().getId();

        } catch (Exception e) {
            e.printStackTrace();
            return "❌ Failed to save message: " + e.getMessage();
        }
    }

    public List<Message> getAllMessages() {
        List<Message> messageList = new ArrayList<>();
        try {
            Firestore db = FirestoreClient.getFirestore();
            ApiFuture<QuerySnapshot> future = db.collection("messages").get();
            List<QueryDocumentSnapshot> documents = future.get().getDocuments();

            for (QueryDocumentSnapshot doc : documents) {
                Message message = doc.toObject(Message.class);
                messageList.add(message);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return messageList;
    }

}
