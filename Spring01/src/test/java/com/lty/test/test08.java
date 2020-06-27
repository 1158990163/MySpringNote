package com.lty.test;

import com.lty.JDBC.Bus.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test08 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanJdbc.xml");
        User userImpl1 = context.getBean("userImpl", User.class);
        userImpl1.accountMoney();
    }
}
