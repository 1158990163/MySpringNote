package com.lty.Dao;

public class UserOracleImpl implements User {
    @Override
    public void getUser() {
        System.out.println("使用Oracle的用户行为");
    }
}
