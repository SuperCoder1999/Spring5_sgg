package com.atguigu.spring5.aopxml;

/**
 * 此类是增强类
 */
public class BookProxy {
    public void beforeMethod() {
        System.out.println("before.........");
    }
}
