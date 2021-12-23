package com.atguigu.spring5.service.impl;

import com.atguigu.spring5.dao.UserDao;
import com.atguigu.spring5.service.UserService;

/**
 * 通过外部 bean 注入属性
 */
public class UserServiceImpl implements UserService {

    //1.创建UserDao类型属性
    private UserDao userDao;

    //2.生成set方法,用于注入UserDao属性
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add() {
        System.out.println("UserServiceImpl add()...");
        userDao.update();
    }
}
