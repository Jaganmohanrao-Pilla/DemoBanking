package com.demo.model;

import com.demo.misc.statusType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;
import java.util.Random;

@Entity
public class Friends {
    @Id
    private int friendshipId;
    @ManyToOne
    @JoinColumn(name="friend_id", nullable=false)
    private User friendId;
    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User userId;
    private LocalDateTime sentTime;
    private statusType status;


    public Friends() {
        super();
    }

    public Friends(int id,User friendId, User userId, LocalDateTime sentTime, statusType status) {
        super();
        this.friendshipId = id;
        this.friendId = friendId;
        this.userId = userId;
        this.sentTime = sentTime;
        this.status = status;
    }
    public int getFriendshipId() {
        return friendshipId;
    }
    public void setFriendshipId(int friendshipId) {
        this.friendshipId = friendshipId;
    }
    public User getFriendId() {
        return friendId;
    }
    public void setFriendId(User friendId) {
        this.friendId = friendId;
    }
    public User getUserId() {
        return userId;
    }
    public void setUserId(User userId) {
        this.userId = userId;
    }
    public LocalDateTime getSentTime() {
        return sentTime;
    }
    public void setSentTime(LocalDateTime sentTime) {
        this.sentTime = sentTime;
    }
    public statusType getStatus() {
        return status;
    }
    public void setStatus(statusType status) {
        this.status = status;
    }

   //generate tostring
    @Override
    public String toString() {
        return "Friends [friendshipId=" + friendshipId + ", friendId=" + friendId + ", userId=" + userId + ", sentTime="
                + sentTime + ", status=" + status + "]";
    }



}
