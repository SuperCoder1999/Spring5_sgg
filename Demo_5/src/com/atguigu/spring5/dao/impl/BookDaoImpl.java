package com.atguigu.spring5.dao.impl;

import com.atguigu.spring5.dao.BookDao;
import com.atguigu.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * JavaWeb中的UserDao实现类
 */
@Component
public class BookDaoImpl implements BookDao {
    //注入JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addBook(Book book) {
        String sql = "insert into t_book values(?, ?, ?)";
        Object[] args = {book.getUserId(), book.getUsername(), book.getUstatus()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println("add() " + update);
    }

    @Override
    public void updateBook(Book book) {
        String sql = "update t_book set username=?, ustatus=? where user_id=?";
        Object[] args = {book.getUsername(), book.getUstatus(), book.getUserId()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println("updateBook() " + update);
    }

    @Override
    public void deleteBook(String id) {
        String sql = "delete from t_book where user_id=?";
        int delete = jdbcTemplate.update(sql, id);
        System.out.println("deleteBook() " + delete);
    }

    @Override
    public Integer selectCount() {
        String sql = "select count(*) from t_book";
        Integer res = jdbcTemplate.queryForObject(sql, Integer.class);
        //第二个参数是 返回类型 的class
        return res;
    }

    @Override
    public Book findBookInfo(String id) {
        String sql = "select * from t_book where user_id=?";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);
        return book;
    }

    @Override
    public List<Book> findAllBook() {
        String sql = "select * from t_book";
        List<Book> books = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        return books;
    }

    @Override
    public void batchAddBook(List<Object[]> batchArgs) {
        String sql = "insert into t_book values(?, ?, ?)";
        int[] res = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println("batchAddBook " + Arrays.toString(res));
    }

    @Override
    public void batchUpdateBook(List<Object[]> batchArgs) {
        String sql = "update t_book set username=?, ustatus=? where user_id=?";
        int[] res = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println("batchUpdateBook " + Arrays.toString(res));
    }

    @Override
    public void batchDeleteBook(List<Object[]> batchArgs) {
        String sql = "delete from t_book where user_id=?";
        int[] res = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println("batchDeleteBook " + Arrays.toString(res));
    }
}
