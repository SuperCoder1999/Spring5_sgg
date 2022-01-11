package com.atguigu.spring5.dao;

public interface UserDao {
    //入账
    public void addMoney();

    //出账
    public void reduceMoney();
}
