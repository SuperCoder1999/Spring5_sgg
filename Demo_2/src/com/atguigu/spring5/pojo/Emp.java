package com.atguigu.spring5.pojo;

public class Emp {
    private String ename;
    private String gender;

    //部门属性 - Emp的参数是对象
    private Dept dept;

    //对象dept的get方法. 用于获取需要注入的对象,以此 设置注入对象的属性
    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void add() {
        System.out.println(ename+"::"+gender+"::"+dept);
    }
}
