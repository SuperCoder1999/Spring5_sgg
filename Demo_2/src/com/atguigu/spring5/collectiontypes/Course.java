package com.atguigu.spring5.collectiontypes;

/**
 * 被当作元素 注入到 List中的 对象
 */
public class Course {

    private String cname;

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }
}
