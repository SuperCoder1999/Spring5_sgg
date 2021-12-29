package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDao;
import com.atguigu.spring5.dao.impl.BookDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 基于注解方式 实现 对象/普通 属性注入
 */
@Service
public class UserService2 {
    //定义dao类型属性
    //添加 注入属性 注解
    //1.Autowired根据属性类型自动装配
    //2.Qualifier:根据名称进行自动注入, 和@Autowired一起使用
    @Autowired
    @Qualifier(value="userDaoImpl2")
    private UserDao userDao;

    //@Resource //不带name属性,就是根据类型进行自动注入
    @Resource(name="bookDaoImpl2")//带有name属性,是根据名称进行自动注入
    private BookDaoImpl bookDao;

    //基于注解 实现普通属性注入
    @Value("jack")
    private String name;

    public void add() {
        System.out.println("UserService2 add() ... ");
        userDao.add();
        bookDao.add();
        System.out.println("name= " + name);
    }

}
