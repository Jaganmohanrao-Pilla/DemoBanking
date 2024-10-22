package com.demo.dto;

import com.demo.model.PasswordHistory;
import com.demo.model.User;

import java.time.LocalDateTime;

public class PasswordHistoryDTO {
    private int passwordId;
    private User userId;
    private String email;
    private String password;
    private LocalDateTime date;
    public PasswordHistoryDTO() {
    }
    public PasswordHistoryDTO(User userId, String email, String password, LocalDateTime date) {
        super();
        this.userId = userId;
        this.email = email;
        this.password = password;
        this.date = date;
    }
    public int getPasswordId() {
        return passwordId;
    }
    public void setPasswordId(int passwordId) {
        this.passwordId = passwordId;
    }
    public User getUserId() {
        return userId;
    }
    public void setUserId(User userId) {
        this.userId = userId;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public LocalDateTime getDate() {
        return date;
    }
    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    //create to string
    @Override
    public String toString() {
        return "PasswordHistoryDTO [passwordId=" + passwordId + ", userId=" + userId + ", email=" + email
                + ", password=" + password + ", date=" + date + "]";
    }
    //create a method to convert PasswordHistoryDTO to PasswordHistory and viceversa using setters and getters
public PasswordHistoryDTO convertToDTO(PasswordHistory passwordHistoryDTO) {
        PasswordHistoryDTO passwordHistoryDTO1 = new PasswordHistoryDTO();
        passwordHistoryDTO1.setPasswordId(passwordHistoryDTO.getPasswordId());
        passwordHistoryDTO1.setUserId(passwordHistoryDTO.getUserId());
        passwordHistoryDTO1.setEmail(passwordHistoryDTO.getEmail());
        passwordHistoryDTO1.setPassword(passwordHistoryDTO.getPassword());
        passwordHistoryDTO1.setDate(passwordHistoryDTO.getDate());
        return passwordHistoryDTO1;
    }
    public PasswordHistory convertToEntity(PasswordHistoryDTO passwordHistoryDTO) {
        PasswordHistory passwordHistoryDTO1 = new PasswordHistory();
        passwordHistoryDTO1.setPasswordId(passwordHistoryDTO.getPasswordId());
        passwordHistoryDTO1.setUserId(passwordHistoryDTO.getUserId());
        passwordHistoryDTO1.setEmail(passwordHistoryDTO.getEmail());
        passwordHistoryDTO1.setPassword(passwordHistoryDTO.getPassword());
        passwordHistoryDTO1.setDate(passwordHistoryDTO.getDate());
        return passwordHistoryDTO1;
    }

}
