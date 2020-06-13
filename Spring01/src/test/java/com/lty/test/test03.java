package com.lty.test;

import com.lty.Dao.BookImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


class test03 {
    public static void main(String[] args) {
        ApplicationContext appletContext = new ClassPathXmlApplicationContext("bean1.xml");
        BookImpl books = (BookImpl) appletContext.getBean("b1");
        System.out.println(books);
    }


}

