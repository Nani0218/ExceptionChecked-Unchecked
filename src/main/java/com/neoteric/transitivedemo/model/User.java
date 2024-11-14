package com.neoteric.transitivedemo.model;

public class User {
    private String userId;

    private  String name;
    public User(String name,String userId ){

        this.name=name;
        this.userId=userId;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }
}
