package com.hxb.demo04;

import java.util.concurrent.PriorityBlockingQueue;

public class Student {
    // 属性
    private String name;
    private int age;
    private String gender;
    private int height;

    // 构造方法
    // 习惯：空参 全参
    public Student() {
        // 空参构造方法
        System.out.println("空参构造方法被调用了");
    }

    public Student(String name, int age, String gender, int height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        System.out.println("全参构造方法被调用了");
    }

    // get/set方法
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
            this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}
