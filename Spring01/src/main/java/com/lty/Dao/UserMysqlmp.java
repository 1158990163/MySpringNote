package com.lty.Dao;

public class UserMysqlmp implements User{
    @Override
    public void getUser() {
        System.out.println("使用Mysql的用户行为");
    }
}
