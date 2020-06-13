package com.lty.test;

import com.lty.AOC.anno.AOPage;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test05 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanAop.xml");
        AOPage aOPage = context.getBean("aopage", AOPage.class);
        aOPage.add();

    }
}
