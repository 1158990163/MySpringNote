package com.lty.test;

import com.lty.pojo.UseServer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test02 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UseServer userOwnServer = (UseServer) context.getBean("userOwnServer");
        userOwnServer.UserAction();
    }
}
