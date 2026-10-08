package com.hxb.demo16;

public class Person {
    String name;
    int age;

    // 无参构造方法
    public Person() {
        System.out.println("父类Person无参构造方法");
    }

    // 带参构造方法
    public Person(String name, int age) {
        System.out.println("父类Person带参构造方法");
        this.name = name;
        this.age = age;
    }
}
