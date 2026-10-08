package com.hxb.demo01;

public class TestDog {
    public static void main(String[] args) {
        // 创建对象，记录第一只小狗的信息
        Dog d1 = new Dog();

        // 赋值
        d1.name = "旺财";
        d1.age = 1;
        d1.weight = 10;
        d1.color = "黄色";

        // 输出结果
        System.out.println("1. " + d1.name);
        System.out.println("2. " + d1.age);
        System.out.println("3. " + d1.weight);
        System.out.println("4. " + d1.color);

        // 创建对象，记录第二只小狗的信息
        Dog d2 = new Dog();

        // 赋值
        d2.name = "小黄";
        d2.age = 2;
        d2.weight = 12;
        d2.color = "红色";

        // 输出结果
        System.out.println("1. " + d2.name);
        System.out.println("2. " + d2.age);
        System.out.println("3. " + d2.weight);
        System.out.println("4. " + d2.color);
    }
}
