package com.atguigu.spring5.aopprinciple;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * 使用Proxy类创建接口代理对象
 */
public class JDKProxy {
    public static void main(String[] args) {
        Class[] interfaces = {UserDao.class};
        UserDaoImpl userDao = new UserDaoImpl();
        //创建接口实现类的代理对象
        UserDao dao = (UserDao)Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        Object res = dao.add(1, 2);
        System.out.println(res);
        Object res2 = dao.update("43");
        System.out.println(res2);
        /* ---- 写成匿名内部类,无法传参???
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces,
                new InvocationHandler(userDao) {
                    @Override//这里才是执行的操作.(原理是什么暂时没搞清楚)
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //方法之前
                        System.out.println("方法之前执行" + method.getName() +
                                ":传递的参数: " + Arrays.toString(args));
                        //被增强的方法执行
                        if (method.getName().equals("add")) {
                            Object res = method.invoke()
                            System.out.println("add被执行");
                        }
                        if (method.getName().equals("update")) {
                            System.out.println("update被执行");
                        }

                    }
                })*/
    }
}
