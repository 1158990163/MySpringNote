package com.lty.JDBC.DAO;

import com.lty.JDBC.entity.Book;

public interface BookDao {
    public void addBook(Book book);

    public void deleteBook(Book book);

    public void updateBook(Book book);

    public int findBook();

    public Book findBookbyID(int id);


}
