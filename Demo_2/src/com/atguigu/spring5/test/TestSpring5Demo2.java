package com.atguigu.spring5.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.atguigu.spring5.autowire.Emp;
import com.atguigu.spring5.beanspan.Orders;
import com.atguigu.spring5.collectiontypes.Book;
import com.atguigu.spring5.collectiontypes.Course;
import com.atguigu.spring5.collectiontypes.Stu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

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

    /**
     * 演示 FactoryBean的使用
     */
    @Test
    public void testFactoryBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/bean3.xml");
        //返回的是 FactoryBean中getObject()方法返回的对象
        Course course = context.getBean("myFactoryBean", Course.class);
        System.out.println(course);
    }

    /**
     * 演示 单实例 和 多实例
     */
    @Test
    public void testSingleton() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/bean4.xml");
        //单实例
        Book book1_1 = context.getBean("book1", Book.class);
        System.out.println(book1_1);
        Book book1_2 = context.getBean("book1", Book.class);
        System.out.println(book1_2);

        //多实例
        Book book2_1 = context.getBean("book2", Book.class);
        System.out.println(book2_1);
        Book book2_2 = context.getBean("book2", Book.class);
        System.out.println(book2_2);
    }

    /**
     * 演示 bean的生命周期
     */
    @Test
    public void testBeanSpan() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/bean5.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("第四步,使用bean对象");

        //手动调用 销毁close()方法
        ((AbstractApplicationContext)context).close();
    }

    /**
     * 演示 xml自动装配
     */
    @Test
    public void testAutoWire() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/bean6.xml");
        //通过 byName的方式 自动装配
        Emp emp = context.getBean("emp1", Emp.class);
        emp.test();

        //通过 byType的方式,自动装配
        Emp emp2 = context.getBean("emp2", Emp.class);
        emp2.test();
    }

    /**
     * 直接配置连接池 获取连接池
     */
    @Test
    public void testDataSourceByBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/bean7.xml");
        DataSource dataSource = context.getBean("dataSource", DruidDataSource.class);
        System.out.println(dataSource);
    }
    /**
     * 引入外部属性文件配置数据库连接池
     */
    @Test
    public void testDataSourceByBean2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/bean7.xml");
        DataSource dataSource2 = context.getBean("dataSource2", DruidDataSource.class);
        System.out.println(dataSource2);
    }
}
