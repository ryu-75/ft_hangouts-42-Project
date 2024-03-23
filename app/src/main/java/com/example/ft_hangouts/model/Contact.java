package com.example.ft_hangouts.model;

import android.widget.ImageView;
import android.widget.TextView;

public class Contact {
    private int   avatar;
    private String  username;
    private String  phoneNumber;

    public Contact(String username, String phoneNumber, int avatar) {
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.avatar = avatar;
    }

    // GETTER
    public  String  getUsername() {
        return username;
    }

    public  String  getPhoneNumber() {
        return phoneNumber;
    }

    public int  getAvatar() {
        return avatar;
    }

    // SETTER
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }
}
