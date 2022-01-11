package com.atguigu.spring5.entity;

public class Book {
    private String userId;
    //数据库中用的是 user_id. 我记得有一个操作需要名称一致???(在Dao和Service中没用到.估计是jsp中的.
    // 在 query查询记录并返回封装好的类中需要用到相同名称['_'和大写 两种间隔方式都是一样的])
    private String username;
    private String ustatus;

    public Book() { //查询单条记录 需要用到无参构造器
    }

    public Book(String userId, String username, String ustatus) {
        this.userId = userId;
        this.username = username;
        this.ustatus = ustatus;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUstatus() {
        return ustatus;
    }

    public void setUstatus(String ustatus) {
        this.ustatus = ustatus;
    }

    @Override
    public String toString() {
        return "Book{" +
                "user_id='" + userId + '\'' +
                ", username='" + username + '\'' +
                ", ustatus='" + ustatus + '\'' +
                '}';
    }
}
