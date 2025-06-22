package com.chatbot.whatsappchatbot.model;

import jakarta.validation.constraints.NotBlank;
import java.util.Date;

public class Message {

    @NotBlank(message = "Sender must not be blank")
    private String sender;

    @NotBlank(message = "Content must not be blank")
    private String content; // ✅ make sure it's "content", not "text"

    private Date timestamp;

    public Message() {}

    public Message(String sender, String content, Date timestamp) {
        this.sender = sender;
        this.content = content;
        this.timestamp = timestamp;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
