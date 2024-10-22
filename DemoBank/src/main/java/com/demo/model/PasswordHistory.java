package com.demo.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class PasswordHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="password_id")
    private int passwordId;
    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User userId;
    private String email;
    private String password;
    private LocalDateTime date;
    public PasswordHistory() {
    }
    public PasswordHistory(User userId, String email, String password, LocalDateTime date) {
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
    //to string
    @Override
    public String toString() {
        return "PasswordHistory [passwordId=" + passwordId + ", userId=" + userId + ", email=" + email + ", password="
                + password + ", date=" + date + "]";
    }

}
