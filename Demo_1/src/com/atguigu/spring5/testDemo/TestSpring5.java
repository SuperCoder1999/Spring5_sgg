package com.atguigu.spring5.testDemo;


import com.atguigu.spring5.Book;
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
}
