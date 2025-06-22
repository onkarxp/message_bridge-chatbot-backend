package com.chatbot.whatsappchatbot.controller;



import com.chatbot.whatsappchatbot.model.Message;
import com.chatbot.whatsappchatbot.service.FirestoreService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MessageController {

    @Autowired
    private FirestoreService firestoreService;

    @PostMapping("/message")
    public String addMessage(@Valid @RequestBody Message message) {
        System.out.println("📥 Message received: " + message.getSender() + " - " + message.getText());
        return firestoreService.saveMessage(message);
    }
    @GetMapping("/messages")
    public List<Message> getMessages() {
        return firestoreService.getAllMessages();
    }

}

