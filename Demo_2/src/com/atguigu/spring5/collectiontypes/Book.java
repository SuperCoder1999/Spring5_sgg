package com.atguigu.spring5.collectiontypes;

import java.util.List;

/**
 * 实现 xml注入集合属性 将集合抽离成一个 不属于任何bean下的 集合
 */
public class Book {
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void test() {
        System.out.println(list);
    }
}
