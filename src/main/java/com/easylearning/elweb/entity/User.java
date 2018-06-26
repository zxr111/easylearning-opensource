package com.easylearning.elweb.entity;

import java.io.Serializable;

/**
 * User bean object.
 */
public class User implements Serializable {

    private String userid;
    private String password;
    private String phone;
    private String username;

    public String getUserid() {
        return userid;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
