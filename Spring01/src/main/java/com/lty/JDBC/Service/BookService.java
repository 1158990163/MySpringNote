package com.lty.JDBC.Service;

import com.lty.JDBC.DAO.BookDao;
import com.lty.JDBC.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    public void addBook(Book book){
        bookDao.addBook(book);
    }
    public void deleteBook(Book book){
        bookDao.deleteBook(book);
    }
    public void updateBook(Book book){
        bookDao.updateBook(book);
    }
    public void fineAllBook(){
        int book = bookDao.findBook();
        System.out.println(book+"条Book数据");
    }
    public void fineAllBookbyID(int id){
        Book bookbyID = bookDao.findBookbyID(id);
        System.out.println(bookbyID);
    }
}
