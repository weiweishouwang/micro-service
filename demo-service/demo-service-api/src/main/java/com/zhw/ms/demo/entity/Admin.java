package com.zhw.ms.demo.entity;

import com.zhw.ms.commons.entity.Entity;

public class Admin extends Entity {

    public String account;

    public String passwd;

    public String name;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}