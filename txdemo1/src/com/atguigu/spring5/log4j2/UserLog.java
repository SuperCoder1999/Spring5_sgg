package com.atguigu.spring5.log4j2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 手动输出日志内容
 */
public class UserLog {
    private static final Logger log = LoggerFactory.getLogger(UserLog.class);

    public static void main(String[] args) {
        log.info("hello log4j2");
        log.warn("hello niejian");
    }
}
