package com.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Random;

@Entity
public class Accounts {
    @Id
    private int accountId;
    private String email;
    //make this a foreign key with the userId in user table with a many to one relationship with user so that user can have multiple accounts
    //also add a list of accounts in user class with one to many relationship
    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User userId;
    private String name;
    private double balance;
    private boolean isActive;
    public Accounts( int id,String email, User userId, String name, double balance) {
        super();
        Random rand = new Random();
        int accountId = 2000+rand.nextInt(1000);
        this.accountId = id;
        this.email = email;
        this.userId = userId;
        this.name = name;
        this.balance = balance;
        this.isActive=false;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public int getAccountId() {
        return accountId;
    }
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    //get setter and getter for userId
    public User getUserId() {
        return userId;
    }
    public void setUserId(User userId) {
        this.userId = userId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account [accountId=" + accountId + ", email=" + email + ", userId=" + userId + ", name=" + name
                + ", balance=" + balance + "]";
    }




}
