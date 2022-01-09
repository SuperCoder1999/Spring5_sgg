package com.atguigu.spring5.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 多个通知增强同一个方法.设置这些通知所在增强类的优先级
 */
@Component
@Aspect
@Order(2)
public class PersonProxy {
    @Before(value="execution(* com.atguigu.spring5.aopanno.User.add(..))")
    public void before() {
        System.out.println("Person Before()...");
    }
}
