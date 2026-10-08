package com.Reflection.Demo05;

import java.io.IOException;

public class Student {
    private String name;
    private int age;

    public Student(){}

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sleep(){
        System.out.println(name + "正在睡觉");
    }

    private void eat(String sm){
        System.out.println(name + "正在吃" + sm);
    }

    private String eat(String sm, int num) throws IOException, NullPointerException, ClassNotFoundException {
        System.out.println(name + "正在吃" + sm + "，吃" + num + "个");
        return "吃完了";
    }

    public String toString(){
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
