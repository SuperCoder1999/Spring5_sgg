package com.atguigu.spring5;

/**
 * IOC操作Bean (xml注入字面量)
 */
public class Book2 {
    //创建属性
    private String bname;
    private String author;
    private String address;

    //有参构造器 - 是测试 p名称空间注入是否可用于 代替有参构造器的注入方式
    /*public Book(String bname, String author) {
        this.bname = bname;
        this.author = author;
    }   答案是 不可以
    */

    //创建属性对应的set方法. 为了让 注入属性的xml方式能找到对应的set方法
    public void setBname(String bname) {
        this.bname = bname;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    //输出两个属性值.在test中用的
    public void testFun() {
        System.out.println(this.bname+"  " + this.author + "   " + address);
    }
}
