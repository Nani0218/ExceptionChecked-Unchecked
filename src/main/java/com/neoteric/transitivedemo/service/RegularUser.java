package com.neoteric.transitivedemo.service;

public class RegularUser extends UserSevice{

    public RegularUser(String userId, String name) {
        super(userId, name);
    }

    @Override
    public String getUserId() {
        return super.getUserId();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public boolean isPremiumUser() {
        return false;
    }
}