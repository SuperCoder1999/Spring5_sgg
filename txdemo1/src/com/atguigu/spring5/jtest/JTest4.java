package com.atguigu.spring5.jtest;

import com.atguigu.spring5.service.UserService;
//import org.junit.Test; //Junit4的包
//import org.junit.runner.RunWith;  //Junit4的包
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Spring5整合JUnit4
 */
//@RunWith(SpringJUnit4ClassRunner.class) //单元测试框架   //整合Junit4的方式
@ContextConfiguration("classpath:bean1.xml") //加载配置文件 相当于 获取context
public class JTest4 {

    @Autowired
    private UserService userService;

    //@Test
    public void test1() {
        userService.accountMoney();
    }
}
