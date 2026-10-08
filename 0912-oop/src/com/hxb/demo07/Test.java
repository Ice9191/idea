package com.hxb.demo07;

public class Test {
    /**
     * static关键字：表示静态，是java的修饰符，用来修饰成员变量/成员方法
     * static修饰成员变量：
     * 特点：叫做静态变量，被该类所有对象共享
     * 调用方式：类名调用（推荐）、对象名调用（不推荐）
     */

    static void main() {

        Student s1 = new Student();
        s1.name = "张三";
        s1.age = 18;
        Student.teacherName = "王老师";

        Student s2 = new Student();
        s2.name = "李四";
        s2.age = 19;
        s2.teacherName = "阿维老师";

        System.out.println(s1.name+", " + s1.age+", " + s1.teacherName);
        System.out.println(s2.name+", " + s2.age+", " + s2.teacherName);
    }
}
