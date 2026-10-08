package com.hxb.demo01;

public class TestTeacher {
    static void main() {
        // 创建老师的对象
        Teacher t1 = new Teacher();

        // 赋值
        t1.name = "张三";
        t1.age = 30;

        System.out.println("1. " + t1.name);
        System.out.println("2. " + t1.age);

        // 调用方法
        t1.teach();
        t1.eat();
        t1.sleep();
    }
}
