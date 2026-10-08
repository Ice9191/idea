package com.hxb.test;

import java.util.concurrent.PriorityBlockingQueue;

// 继承的核心是 extends。子类继承父类后，自动拥有父类的非私有属性和方法，无需重复编写。
// 父类：动物
public class Animal {
    public String name;

    public void eat() {
        System.out.println(name + "正在吃东西...");
    }
}
