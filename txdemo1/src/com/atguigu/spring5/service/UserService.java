package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
//添加事务注解
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ,
timeout = -1, readOnly = false)
public class UserService {
    @Autowired
    private UserDao userDao;

    //转账过程
    public void accountMoney() {

            //lucy少100
            userDao.reduceMoney();
            //模拟异常
            int i = 10 / 0;
            //mary多100
            userDao.addMoney();

        /* 利用普通方式 实现事务
        try {
            //开启事务

            //进行业务操作

            //lucy少100
            userDao.reduceMoney();
            //模拟异常
            int i = 10 / 0;
            //mary多100
            userDao.addMoney();

            //没有异常,进行提交事务
        } catch (Exception e) {
            //出现异常,事务回滚
        }*/

    }
}
