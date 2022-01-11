package com.atguigu.spring5.aopxml;

/**
 * 用xml配置文件的方式实现aop
 * 此类为被增强类
 */
public class Book {
    public void buy() {
        System.out.println("buy.............");
    }
}
