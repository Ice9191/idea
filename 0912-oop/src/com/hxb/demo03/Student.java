package com.hxb.demo03;

public class Student {
    private int age;

    public void setAge(){
        int age = 10;
        // 触发就近原则
        System.out.println(age);
        // 使用成员变量
        System.out.println(this.age);
    }

    public int getAge(){
        return age;
    }
}
