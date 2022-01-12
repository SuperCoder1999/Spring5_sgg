package com.atguigu.spring5.test;

import com.atguigu.spring5.config.TxConfig;
import com.atguigu.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {
    /**
     * 测试 转账过程(注释方式)
     */
    @Test
    public void testUserServiceAnnotation() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    /**
     * 测试 转账过程(xml配置文件方式)
     */
    @Test
    public void testUserServiceXml() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/bean2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    /**
     * 测试 转账过程(完全注解方式)
     */
    @Test
    public void testUserServiceTotalAnnotation() {
        ApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

}
