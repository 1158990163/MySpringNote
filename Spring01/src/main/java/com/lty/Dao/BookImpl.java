package com.lty.Dao;

public class BookImpl implements Book {
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    private String bookName;

    @Override
    public void getBookName() {
        System.out.println(bookName);
    }
}
