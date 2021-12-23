package com.atguigu.spring5;

/**
 * 演示 DI注入属性(基于有参构造器)
 */
public class Orders {
    //属性
    private String oname;
    private String address;
    private int age;

    //有参构造器
    public Orders(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }

    //有参构造器,干扰项
    public Orders(String address, int age) {
        this.address = address;
        this.age = age;
    }

    public void testFun() {
        System.out.println(oname + "  " + address + "  " + age);
    }
}
