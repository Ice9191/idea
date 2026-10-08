package com.hxb.demo27;

import javax.swing.*;

public interface Inter {
    default void login() {
        check();
        System.out.println("执行登录的逻辑");
    }

    default void register() {
        check();
        System.out.println("执行注册的逻辑");
    }

    // JDK8抽取重复代码
    /*default void check() {
        System.out.println("检查网络");
        System.out.println("检查用户名和密码的格式");
        System.out.println("检查用户名是否存在");
    }*/

    // JDK9新增私有方法
    private void check() {
        System.out.println("检查网络");
        System.out.println("检查用户名和密码的格式");
        System.out.println("检查用户名是否存在");
    }
}
