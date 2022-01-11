package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    //转账过程
    public void accountMoney() {
        //lucy少100
        userDao.reduceMoney();

        //mary多100
        userDao.addMoney();
    }
}
