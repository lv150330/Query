package com.lsl.model;

public class User {

    private Integer userId;
    private String userName;
    private String address;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User() {
    }

    public User(Integer userId, String userName, String address) {
        this.userId = userId;
        this.userName = userName;
        this.address = address;
    }
}
