package com.atguigu.spring5.aopprinciple;

/**
 * AOP底层原理的展示 - 有接口时 创建接口实现类代理对象
 */
public interface UserDao {
    //创建接口,定义方法
    public int add(int a, int b);
    public String update(String id);
}
