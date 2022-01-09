package com.atguigu.spring5.aopprinciple;

/**
 * 创建接口实现类,实现方法.回头对这个类中的方法进行强化
 */
public class UserDaoImpl implements UserDao {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public String update(String id) {
        return id;
    }
}
