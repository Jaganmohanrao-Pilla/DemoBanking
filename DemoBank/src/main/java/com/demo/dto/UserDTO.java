package com.demo.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

public class UserDTO {
    //create userDTO class from user class with necessary fields validations
    private int userId;
    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String gender;
    private String emailId;
    private String passWord;
    private boolean accountStatus;
    private  LocalDateTime lastLogin;
    private  LocalDate dateOfBirth;

    public UserDTO() {
    }
    //constructor with all fields
    public UserDTO(String firstName, String lastName, String mobileNumber, String gender, String emailId,
                String passWord, LocalDate dateOfBirth) {
        Random rand = new Random();
        int cid = rand.nextInt(1000);
        this.userId = cid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.gender = gender;
        this.emailId = emailId;
        this.passWord = passWord;
        this.accountStatus = true;
        this.lastLogin = LocalDateTime.now();
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDateTime getLastLogin() {
        return lastLogin;
    }
    //getters and setters for all fields
    public void setLastLogin(LocalDateTime date) {
        this.lastLogin = date;
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
    //getters and setters for all fields
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    //getters and setters for all fields
    public String getMobileNumber() {
        return mobileNumber;
    }
    //getters and setters for all fields
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    //getters and setters
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
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    //create method to convert entity to dto and vice versa
    public static UserDTO valueOf(com.demo.model.User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(user.getUserId());
        userDTO.setFirstName(user.getFirstName());
        userDTO.setLastName(user.getLastName());
        userDTO.setMobileNumber(user.getMobileNumber());
        userDTO.setGender(user.getGender());
        userDTO.setEmailId(user.getEmailId());
        userDTO.setPassWord(user.getPassWord());
        userDTO.setAccountStatus(user.isAccountStatus());
        userDTO.setLastLogin(user.getLastLogin());
        userDTO.setDateOfBirth(user.getDateOfBirth());
        return userDTO;
    }
    //create method to convert entity to dto and vice versa
    public com.demo.model.User createEntity() {
        com.demo.model.User user = new com.demo.model.User();
        user.setUserId(this.getUserId());
        user.setFirstName(this.getFirstName());
        user.setLastName(this.getLastName());
        user.setMobileNumber(this.getMobileNumber());
        user.setGender(this.getGender());
        user.setEmailId(this.getEmailId());
        user.setPassWord(this.getPassWord());
        user.setAccountStatus(this.isAccountStatus());
        user.setLastLogin(this.getLastLogin());
        user.setDateOfBirth(this.getDateOfBirth());
        return user;
    }
    //create toString method
    @Override
    public String toString() {
        return "User [firstName=" + firstName +"userId:"+ userId +"DOB:"+dateOfBirth+
                ", lastName=" + lastName + ", mobileNumber=" + mobileNumber
                + ", gender=" + gender + ", emailId=" + emailId + ", passWord=" + passWord + "]";
    }
}
