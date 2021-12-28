package com.atguigu.spring5.factorybean;

import com.atguigu.spring5.collectiontypes.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * FactoryBean 在xml中配置后,创建时返回的是 FactoryBean中getObject()方法返回对象
 */
public class MyFactoryBean implements FactoryBean<Course> {
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("jack");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
