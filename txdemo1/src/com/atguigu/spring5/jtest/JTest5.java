package com.atguigu.spring5.jtest;

import com.atguigu.spring5.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * Spring5整合JUnit4
 */
@SpringJUnitConfig(locations = "classpath:bean1.xml") //用一个注解代替整合Junit4时的两个注解
public class JTest5 {

        @Autowired
        private UserService userService;

        @Test
        public void test1() {
            userService.accountMoney();
        }
}
