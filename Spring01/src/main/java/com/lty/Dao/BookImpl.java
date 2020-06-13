package com.lty.Dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;


public class BookImpl implements Book {

    private String bookName;

    private Autor writer;

    public void setWriter(Autor writer) {
        this.writer = writer;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void getBookName() {
        System.out.println(bookName);
    }

    public String toString() {
        return "BookImpl{" +
                "bookName='" + bookName + '\'' +
                ", writer=" + writer +
                '}';
    }
}
