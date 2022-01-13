package com.atguigu.spring5.functionalinterface;


//import org.junit.Test; //Junit4 的包
import org.junit.jupiter.api.Test;  //Junit5 的包
import org.springframework.context.support.GenericApplicationContext;

/**
 * 核心容器 支持函数式风格
 * 即 函数式风格 创建对象,交给Spring进行管理
 */
public class FunctionalInterface {
    @Test
    public void createObjectToSpring() {
        //1. 创建GenericApplicationContext对象
        GenericApplicationContext context = new GenericApplicationContext();

        //2.调用context的方法 进行对象注册
        context.refresh();
        context.registerBean("user1", User.class, () -> new User());
        context.registerBean("user2", User.class);
        context.registerBean("user3", User.class, User::new);
        //context.registerBean("user4", User.class, new User()); //这样写 不i对

        //不指定 注册实例名称
        context.registerBean(User.class);

        //3.获取在spring注册的对象
        User user1 = (User)context.getBean("user1");
        User user2 = (User)context.getBean("user2");
        User user3 = (User)context.getBean("user3");
        //User user4 = (User)context.getBean("user4");
        //没有指定注册实例名称时,需要用全类名 获取对象
        User user = (User)context.getBean("com.atguigu.spring5.functionalinterface.User");

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        //System.out.println(user4);

        System.out.println(user);

    }

}
