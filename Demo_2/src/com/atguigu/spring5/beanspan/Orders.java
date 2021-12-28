package com.atguigu.spring5.beanspan;

/**
 * 演示 bean的生命周期
 */
public class Orders {
    private String name;

    public Orders() {
        System.out.println("第一步,执行无参构造器创建bean实例");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("第二步,执行set方法设置属性值(应该是只在<property>标签中才会调用到无参构造器和set方法)");
    }

    //被配置到bean中的 初始化方法
    public void myInitMethod() {
        System.out.println("第三步,执行初始化方法(需要在bean中配置说明要调用)");
    }

    //被配置到bean中的 销毁方法
    public void myDestroyMethod() {
        System.out.println("第五步,执行销毁方法(需要在bean中配置说明要调用)");
    }
}
