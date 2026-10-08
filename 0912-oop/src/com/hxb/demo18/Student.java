package com.hxb.demo18;

public class Student extends Person {

    // 本包中的其他类（子类或者无关类都一样）
    public void show() {
        System.out.println(name);
        super.test();
    }
}
