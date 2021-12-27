package com.atguigu.spring5.collectiontypes;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 实现 xml注入 集合 属性 及  向list集合中 注入对象元素
 */
public class Stu {
    //1.数组类型属性
    private String[] courses;
    //2.List集合类型属性
    private List<String> list;
    //3.map集合类型属性
    private Map<String, String> maps;
    //4.set集合类型属性
    private Set<String> sets;

    //5.向list集合中 注入对象元素
    private List<Course> courseList;

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    //集合对应的 set方法,用于property对set的调用
    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public void test() {
        System.out.println(Arrays.toString(courses));
        System.out.println(list);
        System.out.println(maps);
        System.out.println(sets);
        System.out.println(courseList);
    }
}
