package com.lty.pojo;

import com.lty.Dao.User;

public class UseServerImpl implements UseServer {

    User user;

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public void UserAction() {
        user.getUser();
    }
}
