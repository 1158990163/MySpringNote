package com.lty.test;

import com.lty.pojo.UseServer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test01 {
    public static void main(String[] args) {

        ApplicationContext application = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UseServer serverUser = (UseServer) application.getBean("serverUser");
        serverUser.UserAction();

    }
}
