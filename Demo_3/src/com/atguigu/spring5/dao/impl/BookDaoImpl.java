package com.atguigu.spring5.dao.impl;

import org.springframework.stereotype.Component;

@Component(value="bookDaoImpl2")
public class BookDaoImpl {
    public void add() {
        System.out.println("BookDaoImpl  add()  ...  ");
    }
}
