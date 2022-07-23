package com.launcher.controller.persistence;

import java.io.Serializable;

public class ValidAccount implements Serializable {

    public String address;
    public String password;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ValidAccount(String address, String password) {
        this.address = address;
        this.password = password;
    }
}
