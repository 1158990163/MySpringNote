package com.lty.JDBC.DAO;

import com.lty.JDBC.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;


@Repository
public class BookDaoImpl implements BookDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addBook(Book book) {
        String sql = "insert into book value (?,?)";
        Object[] args = {book.getId(), book.getBookname()};
        int i = jdbcTemplate.update(sql, args);
        System.out.println(i + "条数据增加");
    }

    @Override
    public void deleteBook(Book book) {
        String sql = "delete from book where id =?";
        Object[] args = {book.getId()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update + "条数据删除");
    }

    @Override
    public void updateBook(Book book) {
        String sql = "update book set bookname = ?where id=?";
        Object[] args = {book.getBookname(), book.getId()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update + "条数据更新");

    }

    @Override
    public int findBook() {
        String sql = "select * from book";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        System.out.println(maps);
        return maps.size();
    }

    @Override
    public Book findBookbyID(int id) {
        String sql = "select * from book where id = ?";
        return jdbcTemplate.queryForObject(sql, new RowMapper<Book>() {
                    @Override
                    public Book mapRow(ResultSet resultSet, int i) throws SQLException {
                        int id1 = resultSet.getInt("id");
                        String bookname = resultSet.getString("bookname");
                        return new Book(id1, bookname);
                    }
                }, id
        );
    }

}
