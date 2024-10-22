package com.demo.dto;

import com.demo.model.User;

import java.time.LocalDateTime;
import java.util.Random;

public class MessagesDTO {
    private int messageId;
    private User senderId;
    private User receiverId;
    private String message;
    private boolean isSolved;
    private LocalDateTime sentDate;

    public MessagesDTO() {
        super();
    }

    public MessagesDTO(User sender_id, User receiver_id, String message, LocalDateTime sent_date) {
        super();
        Random rand = new Random();
        int id = 4000 + rand.nextInt(1000);
        this.messageId = id;
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

    public void setSentDate(LocalDateTime sentDate) {
        this.sentDate = sentDate;
    }

    //generate tostring
    @Override
    public String toString() {
        return "Messages [messageId=" + messageId + ", sender_id=" + senderId + ", receiver_id=" + receiverId
                + ", message=" + message + ", isSolved=" + isSolved + ", sent_date=" + sentDate + "]";
    }

    //create methods to convert dto to entity and vice versa using setters and getters
    public com.demo.model.Messages convertToEntity() {
        com.demo.model.Messages message = new com.demo.model.Messages();
        message.setMessageId(this.messageId);
        message.setSenderId(this.senderId);
        message.setReceiverId(this.receiverId);
        message.setMessage(this.message);
        message.setSolved(this.isSolved);
        message.setSentDate(this.sentDate);
        return message;
    }

    public static MessagesDTO convertToDTO(com.demo.model.Messages message) {
        MessagesDTO messageDTO = new MessagesDTO();
        messageDTO.setMessageId(message.getMessageId());
        messageDTO.setSenderId(message.getSenderId());
        messageDTO.setReceiverId(message.getReceiverId());
        messageDTO.setMessage(message.getMessage());
        messageDTO.setSolved(message.isSolved());
        messageDTO.setSentDate(message.getSentDate());
        return messageDTO;
    }
}

