package com.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;
import java.util.Random;

@Entity
public class Messages {

    @Id
    private int messageId;
    @ManyToOne
    @JoinColumn(name="sender_id", nullable=false)
    private User senderId;
    @ManyToOne
    @JoinColumn(name="receiver_id", nullable=false)
    private User receiverId;
    private String message;
    private boolean isSolved;
    private LocalDateTime sentDate;
    public Messages() {
        super();
    }
    public Messages(int id,User sender_id, User receiver_id, String message, LocalDateTime sent_date) {
        super();
        this.messageId=id;
        this.senderId = sender_id;
        this.receiverId = receiver_id;
        this.message = message;
        this.isSolved = false;
        this.sentDate = sent_date;
    }
    //give getters and setters for all fields
    public int getMessageId() {
        return messageId;
    }
    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }
    public User getSenderId() {
        return senderId;
    }
    public void setSenderId(User sender_id) {
        this.senderId = sender_id;
    }
    public User getReceiverId() {
        return receiverId;
    }
    public void setReceiverId(User receiver_id) {
        this.receiverId = receiver_id;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public boolean isSolved() {
        return isSolved;
    }
    public void setSolved(boolean isSolved) {
        this.isSolved = isSolved;
    }
    public LocalDateTime getSentDate() {
        return sentDate;
    }
    public void setSentDate(LocalDateTime sent_date) {
        this.sentDate = sent_date;
    }
    //generate tostring
    @Override
    public String toString() {
        return "Messages [messageId=" + messageId + ", sender_id=" + senderId + ", receiver_id=" + receiverId
                + ", message=" + message + ", isSolved=" + isSolved + ", sent_date=" + sentDate + "]";
    }


}
