package com.atguigu.spring5.dao.impl;

import com.atguigu.spring5.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * 实现UserDao,真正要被注入到UserService中的对象
 */
@Repository(value="userDaoImpl2")
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("UserDaoImpl  add() .... ");
    }
}
