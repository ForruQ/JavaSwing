package com.sujon.pojo;

public class User {

    private int id;
    private String name;
    private String email;
    private String mobile;
    private String username;
    private String password;
    private String userType;

    public User(String name, String email, String mobile, String username, String password, String userType) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.username = username;
        this.password = password;
        this.userType = userType;
    }

    public User(int id, String name, String email, String mobile, String username, String password, String userType) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.username = username;
        this.password = password;
        this.userType = userType;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getUserType() {
        return userType;
    }
    
    

}
