package com.assignment.user;

public class User {
    private long mobile;
    private  String password;

    public void setPassword(String password) {
        this.password = password;
    }

    private String userName;
    private String email;

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
