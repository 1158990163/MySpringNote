package com.lty.test;

import com.lty.JDBC.Service.BookService;
import com.lty.JDBC.entity.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test07 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanJdbc.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book(2, "无名氏2");
        bookService.addBook(book);
    }

    @Test
    public void delete() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanJdbc.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
//        Book book = new Book(2, "JAVA");
//        bookService.updateBook(book);

//        bookService.fineAllBook();

        bookService.fineAllBookbyID(1);
    }



}
