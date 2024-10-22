package com.demo.dto;

import com.demo.model.User;

import java.util.Random;

public class AccountsDTO {
    private int accountId;
    private String email;
    private User userId;
    private String name;
    private double balance;
    private boolean isActive;

    public AccountsDTO() {
        super();
    }

    public AccountsDTO(String email, User userId, String name, double balance) {
        super();
        Random rand = new Random();
        int accountId = 2000 + rand.nextInt(1000);
        this.accountId = accountId;
        this.email = email;
        this.userId = userId;
        this.name = name;
        this.balance = balance;
        this.isActive = false;
    }
//getters and setters for all fields
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
    //create methods to convert entity to dto and vice versa
    public static AccountsDTO entityToDto(AccountsDTO account) {
        AccountsDTO accountDto = new AccountsDTO();
        accountDto.setAccountId(account.getAccountId());
        accountDto.setEmail(account.getEmail());
        accountDto.setUserId(account.getUserId());
        accountDto.setName(account.getName());
        accountDto.setBalance(account.getBalance());
        accountDto.setActive(account.isActive());
        return accountDto;
    }
    public static AccountsDTO dtoToEntity(AccountsDTO accountDto) {
        AccountsDTO account = new AccountsDTO();
        account.setAccountId(accountDto.getAccountId());
        account.setEmail(accountDto.getEmail());
        account.setUserId(accountDto.getUserId());
        account.setName(accountDto.getName());
        account.setBalance(accountDto.getBalance());
        account.setActive(accountDto.isActive());
        return account;
    }



}
