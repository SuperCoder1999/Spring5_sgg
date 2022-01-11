package com.atguigu.spring5.test;

import com.atguigu.spring5.aopanno.User;
import com.atguigu.spring5.aopxml.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {
    /**
     * 演示 注释实现aop
     */
    @Test
    public void testAopAnno() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/bean1.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }

    /**
     * 利用xml配置文件实现 aop
     */
    @Test
    public void testAopByXml() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/bean2.xml");
        Book book = context.getBean("book", Book.class);
        book.buy();
    }
}
