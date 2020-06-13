package com.lty.test;

import com.lty.JDBC.MyJdbc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test06 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanJdbc.xml");
        MyJdbc myjdbc = context.getBean("myjdbc", MyJdbc.class);
        System.out.println(myjdbc);
    }
}
