package com.hxb.demo18;

public class Person {

    public String name;

    public void test() {
        System.out.println("父类test方法");
    }

    // 同一类中
    public void show() {
        System.out.println(name);
        test();
    }
}
