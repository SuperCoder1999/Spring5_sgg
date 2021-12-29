package com.atguigu.spring5.test;

import com.atguigu.spring5.config.SpringConfig;
import com.atguigu.spring5.service.UserService;
import com.atguigu.spring5.service.UserService2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {
    /**
     * 基于注解实现对象创建
     */
    @Test
    public void testAnnotation() {
        //通过配置文件 启用组件扫描
        ApplicationContext context = new ClassPathXmlApplicationContext("/bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }

    /**
     * 基于注解 实现 对象/普通 属性注入
     */
    @Test
    public void testAutoWired() {
        //通过配置文件 启用组件扫描
        ApplicationContext context = new ClassPathXmlApplicationContext("/bean1.xml");
        UserService2 service2 = context.getBean("userService2", UserService2.class);
        System.out.println(service2);
        service2.add();
    }

    /**
     * 完全注解开发
     */
    @Test
    public void testSpringConfig() {
        //加载配置类
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
        UserService2 service2 = context.getBean("userService2", UserService2.class);
        System.out.println(service2);
        service2.add();
    }
}
