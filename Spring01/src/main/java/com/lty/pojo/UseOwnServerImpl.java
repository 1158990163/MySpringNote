package com.lty.pojo;

import com.lty.Dao.User;

public class UseOwnServerImpl implements UseServer {
    User user;
    public String dbName;

    public UseOwnServerImpl() {
    }

    public UseOwnServerImpl(String dbName) {
        this.dbName = dbName;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public void UserAction() {
        user.getUser();
        System.out.println("this Object`s dbname is " + dbName);

    }
}
