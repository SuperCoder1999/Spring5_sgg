package com.atguigu.spring5.dao;

import com.atguigu.spring5.entity.Book;

import java.util.List;

/**
 * JavaWeb中的UserDao接口,用于直接处理数据库
 */
public interface BookDao {
    public void addBook(Book book);

    public void updateBook(Book book);

    public void deleteBook(String id);

    public Integer selectCount();

    public Book findBookInfo(String id);

    public List<Book> findAllBook();

    public void batchAddBook(List<Object[]> batchArgs);

    public void batchUpdateBook(List<Object[]> batchArgs);

    public void batchDeleteBook(List<Object[]> batchArgs);
}
