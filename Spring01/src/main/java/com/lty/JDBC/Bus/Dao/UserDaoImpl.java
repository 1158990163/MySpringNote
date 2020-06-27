package com.lty.JDBC.Bus.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addMoney() {
        String sql = "update money set money = money + ? where Username = ?";
        int update = jdbcTemplate.update(sql,100,"lucy");
        System.out.println(update);
    }

    @Override
    public void increaseMoney() {
        String sql = "update money set money = money - ? where Username = ?";
        jdbcTemplate.update(sql,100,"mary");
    }
}
