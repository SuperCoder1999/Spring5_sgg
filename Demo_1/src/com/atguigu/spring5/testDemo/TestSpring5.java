package com.atguigu.spring5.testDemo;


import com.atguigu.spring5.Book;
import com.atguigu.spring5.Book2;
import com.atguigu.spring5.Orders;
import com.atguigu.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {

    @Test
    public void testUser() {
        //1.加载 spring配置文件
        //ApplicationContext context = new ClassPathXmlApplicationContext("/com/atguigu/spring5/xml_/bean1.xml");
        //ApplicationContext context = new ClassPathXmlApplicationContext("com/atguigu/spring5/xml_/bean1.xml");
        //ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //以上 三种 路径都是正确的
        ApplicationContext context = new ClassPathXmlApplicationContext("/bean1.xml");

        //2.获取配置 中要创建的对象 --- 这里默认调用的是无参构造器.必要时需要明写无参构造器
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }

    @Test
    public void testBook() {
        //1.加载 spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("/bean1.xml");

        //2.获取配置 中要创建的对象
        Book book = context.getBean("book", Book.class);
        //3.在创建对象的之后 就用set方法将xml中的属性注入到该对象了
        book.testFun();
    }

    /**
     * 测试 p名称空间注入
     * 就是简化 xml注入中的 set方法 注入
     */
    @Test
    public void testP() {
        //1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("/bean1.xml");
        //2.获取配置 中要创建的对象
        Book book2 = context.getBean("book2", Book.class);
        //3.在创建对象的之后 就用set方法将xml中的属性注入到该对象了

        book2.testFun();
    }

    @Test
    public void testOrders() {
        //1.加载 spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("/bean1.xml");

        //2.获取配置 中要创建的对象 在创建对象时 是调用有参构造器创建的
        // 并将xml中的属性用到有参构造器中了
        Orders orders1 = context.getBean("orders1", Orders.class);

        //测试 constructor-arg区分不同的有参构造器
        Orders orders2 = context.getBean("orders2", Orders.class);
        orders1.testFun();
        orders2.testFun();
    }

    /**
     * 测试 xml注入字面量
     */
    @Test
    public void testZ() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/bean1.xml");

        //1.注入null值
        Book2 book_2 = context.getBean("book_2", Book2.class);
        book_2.testFun();

        //2.注入含有特殊符号的值
        Book2 book_2_2 = context.getBean("book_2_2", Book2.class);
        book_2_2.testFun();

        //测试,是否真的是注入了字面量
        // ---字面量就是看到的常量.而不是将Book2类中的属性设置默认值
        Book2 book2_new = context.getBean("book_2_new", Book2.class);
        book2_new.testFun();
    }
}
