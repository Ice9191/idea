package com.hxb.demo16;

public class Teacher extends Person {
    String subject;

    public Teacher() {
        System.out.println("子类Teacher无参构造方法");
    }

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
        System.out.println("子类Teacher带参构造方法");
    }
}
