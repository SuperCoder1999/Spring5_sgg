package com.atguigu.spring5.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * 注解实现对象创建
 */
//@Component(value="userService")
//@Service
//@Controller
@Repository
public class UserService {
    public void add() {
        System.out.println("UserService add()...");
    }
}
