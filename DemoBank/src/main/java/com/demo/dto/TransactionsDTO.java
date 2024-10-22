package com.demo.dto;

import com.demo.misc.TransactionType;
import com.demo.model.Accounts;
import com.demo.model.User;

import java.time.LocalDateTime;
import java.util.Random;

public class TransactionsDTO {
    private int transactionId;
    private User senderUserId;

    private User receiverUserId;
    private double amount;
    private String message;
    private boolean isValid;
    private TransactionType transactionType;
    private Accounts senderAccountId;
    private Accounts receiverAccountId;
    private LocalDateTime transactionDateTime;
    public TransactionsDTO() {
        super();
    }
    //give constructor for all fields except transactionId
    public TransactionsDTO(User senderUserId, Accounts senderAccountId, User receiverUserId, Accounts receiverAccountId,
                        double amount, String message, LocalDateTime transactionDateTime,TransactionType transactionType) {
        super();
        Random rand = new Random();
        int id = 500000+rand.nextInt(10000);
        this.transactionId = id;
        this.senderUserId = senderUserId;
        this.senderAccountId = senderAccountId;
        this.receiverUserId = receiverUserId;
        this.receiverAccountId = receiverAccountId;
        this.amount = amount;
        this.message = message;
        this.transactionDateTime = transactionDateTime;
        this.isValid = true;
        this.transactionType = transactionType;
    }
    //give setters and getters for all fields
    public int getTransactionId() {
        return transactionId;
    }
    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public User getSenderUserId() {
        return senderUserId;
    }
    public void setSenderUserId(User senderUserId) {
        this.senderUserId = senderUserId;
    }
    public User getReceiverUserId() {
        return receiverUserId;
    }
    public void setReceiverUserId(User receiverUserId) {
        this.receiverUserId = receiverUserId;
    }
    public Accounts getSenderAccountId() {
        return senderAccountId;
    }
    public void setSenderAccountId(Accounts senderAccountId) {
        this.senderAccountId = senderAccountId;
    }
    public Accounts getReceiverAccountId() {
        return receiverAccountId;
    }
    public void setReceiverAccountId(Accounts receiverAccountId) {
        this.receiverAccountId = receiverAccountId;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public LocalDateTime getTransactionDateTime() {
        return transactionDateTime;
    }
    public void setTransactionDateTime(LocalDateTime transactionDateTime) {
        this.transactionDateTime = transactionDateTime;
    }
    public boolean isValid() {
        return isValid;
    }
    public void setValid(boolean isValid) {
        this.isValid = isValid;
    }
    public TransactionType getTransactionType() {
        return transactionType;
    }
    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }
    //create toString() method
    @Override
    public String toString() {
        return "Transactions [transactionId=" + transactionId + ", senderUserId=" + senderUserId + ", senderAccountId="
                + senderAccountId + ", receiverUserId=" + receiverUserId + ", receiverAccountId=" + receiverAccountId
                + ", amount=" + amount + ", message=" + message + ", transactionDateTime=" + transactionDateTime
                + ", isValid=" + isValid + ", transactionType=" + transactionType + "]";
    }
    //create method to convert entity to DTO and viceversa using setters and getters
    public static TransactionsDTO entityToDTO(TransactionsDTO transaction) {
        TransactionsDTO transactionDTO = new TransactionsDTO();
        transactionDTO.setTransactionId(transaction.getTransactionId());
        transactionDTO.setSenderUserId(transaction.getSenderUserId());
        transactionDTO.setSenderAccountId(transaction.getSenderAccountId());
        transactionDTO.setReceiverUserId(transaction.getReceiverUserId());
        transactionDTO.setReceiverAccountId(transaction.getReceiverAccountId());
        transactionDTO.setAmount(transaction.getAmount());
        transactionDTO.setMessage(transaction.getMessage());
        transactionDTO.setTransactionDateTime(transaction.getTransactionDateTime());
        transactionDTO.setValid(transaction.isValid());
        transactionDTO.setTransactionType(transaction.getTransactionType());
        return transactionDTO;
    }
    public static TransactionsDTO dtoToEntity(TransactionsDTO transactionDTO) {
        TransactionsDTO transaction = new TransactionsDTO();
        transaction.setTransactionId(transactionDTO.getTransactionId());
        transaction.setSenderUserId(transactionDTO.getSenderUserId());
        transaction.setSenderAccountId(transactionDTO.getSenderAccountId());
        transaction.setReceiverUserId(transactionDTO.getReceiverUserId());
        transaction.setReceiverAccountId(transactionDTO.getReceiverAccountId());
        transaction.setAmount(transactionDTO.getAmount());
        transaction.setMessage(transactionDTO.getMessage());
        transaction.setTransactionDateTime(transactionDTO.getTransactionDateTime());
        transaction.setValid(transactionDTO.isValid());
        transaction.setTransactionType(transactionDTO.getTransactionType());
        return transaction;
    }


}
