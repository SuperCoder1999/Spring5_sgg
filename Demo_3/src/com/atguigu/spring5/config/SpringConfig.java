package com.atguigu.spring5.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

/**
 * 实现完全注解开发
 * 声明自己是配置类, 开启组件扫描,配置扫描文件
 */
@Configurable
@ComponentScan(basePackages = {"com.atguigu.spring5"})
public class SpringConfig {
}
