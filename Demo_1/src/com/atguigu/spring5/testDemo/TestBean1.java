package com.atguigu.spring5.testDemo;


import com.atguigu.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean1 {

    @Test
    public void test() {
        //1.加载 spring配置文件
        //ApplicationContext context = new ClassPathXmlApplicationContext("/com/atguigu/spring5/beans/bean1.xml");
        //ApplicationContext context = new ClassPathXmlApplicationContext("com/atguigu/spring5/beans/bean1.xml");
        //ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //以上 三种 路径都是正确的
        ApplicationContext context = new ClassPathXmlApplicationContext("/bean1.xml");

        //2.获取配置 中要创建的对象
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }
}
