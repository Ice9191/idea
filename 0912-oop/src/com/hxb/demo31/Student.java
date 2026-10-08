package com.hxb.demo31;

public class Student implements Swim {
    @Override
    public void swim() {
        System.out.println("学生在游泳");
    }

    @Override
    public void eat() {
        System.out.println("学生在吃");
    }

    @Override
    public void sleep() {
        System.out.println("学生在睡");
    }
}
