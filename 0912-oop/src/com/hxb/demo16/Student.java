package com.hxb.demo16;

public class Student extends Person {
    String grade;

    public Student() {
        System.out.println("子类Student无参构造方法");
    }

    // 带参构造方法（父的参数 + 子的参数）
    public Student(String name, int age, String grade) {
        // 父类中的属性：通过super(参数)的形式传递给父类的构造方法赋值
        super(name, age);
        // 子类中的属性：自己赋值
        this.grade = grade;
        System.out.println("子类Student带参构造方法");
    }
}
