package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.BookDao;
import com.atguigu.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * JavaWeb中的UserService类,给web层提供服务
 */
@Service
public class BookService {
    //注入Dao
    @Autowired
    private BookDao bookDao;

    //调用BookDao中的方法 操作数据库.为web层提供服务
    public void addBook(Book book) {
        bookDao.addBook(book);
    }

    public void updateBook(Book book) {
        bookDao.updateBook(book);
    }

    public void deleteBook(String id) {
        bookDao.deleteBook(id);
    }

    /**
     * 查询记录的数量
     */
    public Integer selectCount() {
        Integer res = bookDao.selectCount();
        return res;
    }

    /**
     * 查询记录并封装返回
     */
    public Book findOne(String id) {
        Book book = bookDao.findBookInfo(id);
        return book;
    }

    /**
     * 查询多条记录 返回集合
     */
    public List<Book> findAll() {
        List<Book> books= bookDao.findAllBook();
        return books;
    }

    /**
     * 批量插入的操作
     */
    public void batchAddBook(List<Object[]> batchArgs) {
        bookDao.batchAddBook(batchArgs);
    }
    public void batchUpdateBook(List<Object[]> batchArgs) {
        bookDao.batchUpdateBook(batchArgs);
    }
    public void batchDeleteBook(List<Object[]> batchArgs) {
        bookDao.batchDeleteBook(batchArgs);
    }
}
