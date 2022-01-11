package com.atguigu.spring5.test;

import com.atguigu.spring5.entity.Book;
import com.atguigu.spring5.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestSpring5 {
    /**
     * 测试 JdbcTemplate操作数据库
     */
    @Test
    public void testJdbcTemplateAdd() {
        Book book = new Book("1", "java", "1000");
        ApplicationContext context = new ClassPathXmlApplicationContext("/bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.addBook(book);
    }
    @Test
    public void testJdbcTemplateUpdate() {
        Book book = new Book("1", "javaupup", "10001");
        ApplicationContext context = new ClassPathXmlApplicationContext("/bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.updateBook(book);
    }
    @Test
    public void testJdbcTemplateDelete() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.deleteBook("1");
    }

    /**
     * 查询 记录的数量
     */
    @Test
    public void testJdbcTemplateCount() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Integer res = bookService.selectCount();
        System.out.println("count(*) " + res);
    }

    /**
     * 查询一条记录
     */
    @Test
    public void testJdbcTemplateFindOne() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = bookService.findOne("1");
        System.out.println("findOne " + book);
    }

    /**
     * 查询多条记录
     */
    @Test
    public void testJdbcTemplateFindAll() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Book> books = bookService.findAll();
        System.out.println("findAll " + books);
    }

    /**
     * 批量添加 数据
     */
    @Test
    public void testJdbcTemplateBatchAddBook() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        //批量添加测试
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"3","java","a"};
        Object[] o2 = {"4","c++","b"};
        Object[] o3 = {"5","MySQL","c"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchAddBook(batchArgs);
    }

    /**
     * 批量修改 数据
     */
    @Test
    public void testJdbcTemplateBatchUpdateBook() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        //批量修改测试
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"java","1001", "1"};
        Object[] o2 = {"c++","199", "4"};
        Object[] o3 = {"MySQL","2332", "5"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchUpdateBook(batchArgs);
    }

    /**
     * 批量删除 数据
     */
    @Test
    public void testJdbcTemplateBatchDeleteBook() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        //批量删除测试
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] objects1 = {"3"};
        Object[] objects2 = {"4"};
        Object[] objects3 = {"5"};
        batchArgs.add(objects1);
        batchArgs.add(objects2);
        batchArgs.add(objects3);
        bookService.batchDeleteBook(batchArgs);
    }
}
