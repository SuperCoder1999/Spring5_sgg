package com.atguigu.spring5.testDemo;

import com.atguigu.spring5.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    /**
     * 测试 通过外部 bean 注入属性
     */
    @Test
    public void testOuterBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/outerBean.xml");
        UserServiceImpl userService = context.getBean("userServiceImpl", UserServiceImpl.class);
        userService.add();
    }
}
