package com.lty.test;

import com.lty.Dao.Autor;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test04 {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        Autor autor1 = applicationContext.getBean("autor1", Autor.class);
        System.out.println(autor1.getName());
    }
}
