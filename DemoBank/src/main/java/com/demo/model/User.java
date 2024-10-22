package com.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

@Entity
public class User {
    @Id
    private int userId;
    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String gender;
    private String emailId;
    private String passWord;
    private boolean accountStatus;
    private LocalDateTime lastLogin;
    private LocalDate dateOfBirth;
    public User() {
    }
    public User(int id,String firstName, String lastName, String mobileNumber, String gender, String emailId,
                String passWord,LocalDate dateOfBirth) {
        this.userId =id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.gender = gender;
        this.emailId = emailId;
        this.passWord = passWord;
        this.accountStatus = true;
        this.lastLogin= LocalDateTime.now();
        this.dateOfBirth=dateOfBirth;
    }

    public LocalDateTime getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(LocalDateTime date) {
        this.lastLogin =date;
    }
    public String formatLastLoginDateTime() {
        return lastLogin.toString();
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public boolean isAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(boolean accountStatus) {
        this.accountStatus = accountStatus;
    }

    @Override
    public String toString() {
        return "User [firstName=" + firstName +"userId:"+ userId +"DOB:"+dateOfBirth+
                ", lastName=" + lastName + ", mobileNumber=" + mobileNumber
                + ", gender=" + gender + ", emailId=" + emailId + ", passWord=" + passWord + "]";
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
