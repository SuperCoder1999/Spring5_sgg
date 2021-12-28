package com.atguigu.spring5.autowire;

/**
 * 演示 xml自动装配(针对 需要注入对象 的情况)
 */
public class Emp {
    private Dept dept;
    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }

    public void test() {
        System.out.println(dept);
    }
}
