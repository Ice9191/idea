package com.hxb.test;

// 子类：猫（继承动物类）
public class Cat extends Animal {
    // 猫自动拥有动物类的name和eat方法
    // 猫也可以重写（Override）父类的方法
    @Override
    public void eat() {
        System.out.println(name + "正在优雅地吃鱼...");
    }
}
