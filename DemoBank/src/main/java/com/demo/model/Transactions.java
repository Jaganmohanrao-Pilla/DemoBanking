package com.demo.model;

import com.demo.misc.TransactionType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;
import java.util.Random;

@Entity
public class Transactions {

    @Id
    private int transactionId;
    @ManyToOne
    @JoinColumn(name="senderUser_id", nullable=false)
    private User senderUserId;
    @ManyToOne
    @JoinColumn(name="senderAccount_id", nullable=false)
    private Accounts senderAccountId;
    @ManyToOne
    @JoinColumn(name="receiverUser_id", nullable=false)
    private User receiverUserId;
    @ManyToOne
    @JoinColumn(name="receiverAccount_id", nullable=false)
    private Accounts receiverAccountId;
    private double amount;
    private String message;
    private LocalDateTime transactionDateTime;
    private boolean isValid;
    private TransactionType transactionType;
    public Transactions() {
        super();
    }
    //give constructor for all fields except transactionId
    public Transactions(int id,User senderUserId, Accounts senderAccountId, User receiverUserId, Accounts receiverAccountId,
                        double amount, String message, LocalDateTime transactionDateTime,TransactionType transactionType) {
        super();
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
    public Accounts getSenderAccountId() {
        return senderAccountId;
    }
    public void setSenderAccountId(Accounts senderAccountId) {
        this.senderAccountId = senderAccountId;
    }
    public User getReceiverUserId() {
        return receiverUserId;
    }
    public void setReceiverUserId(User receiverUserId) {
        this.receiverUserId = receiverUserId;
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
        //generate tostring
        @Override
        public String toString() {
            return "Transactions [transactionId=" + transactionId + ", senderUserId=" + senderUserId + ", senderAccountId="
                    + senderAccountId + ", receiverUserId=" + receiverUserId + ", receiverAccountId=" + receiverAccountId
                    + ", amount=" + amount + ", message=" + message + ", transactionDateTime=" + transactionDateTime
                    + ", isValid=" + isValid + ", transactionType=" + transactionType + "]";
  }
}
