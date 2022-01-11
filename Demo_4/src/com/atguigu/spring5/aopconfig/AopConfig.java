package com.atguigu.spring5.aopconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * 完全注解开发AOP
 */
@Configuration
@ComponentScan(basePackages = {"com.atguigu.spring5"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AopConfig {
}
