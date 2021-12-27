package com.atguigu.spring5.test;

import com.atguigu.spring5.collectiontypes.Book;
import com.atguigu.spring5.collectiontypes.Stu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5Demo2 {

    /**
     * 实现 xml注入集合属性 包含 元素是对象的情况
     */
    @Test
    public void testCollection1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/bean1.xml");
        Stu stu1 = context.getBean("stu1", Stu.class);
        stu1.test();
    }

    /**
     * 实现 xml注入集合属性 借用 提取的List集合
     */
    @Test
    public void testCollection2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/bean2.xml");
        Book book = context.getBean("book", Book.class);
        book.test();
    }

}
