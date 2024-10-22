package com.demo.dto;

import com.demo.misc.statusType;
import com.demo.model.User;

import java.time.LocalDateTime;
import java.util.Random;

public class FriendsDTO {
    private int friendshipId;
    private User friendId;
    private User userId;
    private LocalDateTime sentTime;
    private statusType status;

    public FriendsDTO() {
        super();
    }

    public FriendsDTO(User friendId, User userId, LocalDateTime sentTime, statusType status) {
        super();
        Random rand = new Random();
        int friendshipId1 = 2000 + rand.nextInt(1000);
        this.friendshipId = friendshipId1;
        this.friendId = friendId;
        this.userId = userId;
        this.sentTime = sentTime;
        this.status = status;
    }

    //getters and setters
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

    //toString
    @Override
    public String toString() {
        return "FriendsDTO [friendshipId=" + friendshipId + ", friendId=" + friendId + ", userId=" + userId + ", sentTime="
                + sentTime + ", status=" + status + "]";
    }
    //create a method to convert to entity using setters and getters and viceversa using setters and getters and default constructor
    //create a method to convert to entity using setters and getters and viceversa using setters and getters and default constructor

    public com.demo.model.Friends convertToEntity() {
        com.demo.model.Friends entity = new com.demo.model.Friends();
        entity.setFriendshipId(this.friendshipId);
        entity.setFriendId(this.friendId);
        entity.setUserId(this.userId);
        entity.setSentTime(this.sentTime);
        entity.setStatus(this.status);
        return entity;
    }

    public static FriendsDTO convertToDTO(com.demo.model.Friends entity) {
        FriendsDTO dto = new FriendsDTO();
        dto.setFriendshipId(entity.getFriendshipId());
        dto.setFriendId(entity.getFriendId());
        dto.setUserId(entity.getUserId());
        dto.setSentTime(entity.getSentTime());
        dto.setStatus(entity.getStatus());
        return dto;
    }

}
