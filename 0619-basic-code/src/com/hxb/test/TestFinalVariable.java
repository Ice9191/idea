package com.hxb.test;

import java.util.ArrayList;

public class TestFinalVariable {
    public static void main(String[] args) {
        // 场景1：基本类型变量 值不能改
        final int a = 10;
        // a = 20; // 报错！因为 final 修饰的变量值不能改变

        // 场景2:引用类型变量 不能指向别的对象，但对象内部的细节可以改变。
        final ArrayList<String> list = new ArrayList<>();
        list.add("Apple"); // 这是可以的，因为对象本身还在，只是往里添加元素了
        list.add("Banana");
        System.out.println(list); // 输出：[Apple, Banana]
        // list = new ArrayList<>(); // 报错！因为 final 修饰的变量引用不能改变

        // 场景3:final修饰的方法 不能被重写
        // 如果父类的一个方法被 final 修饰，那么子类就不能覆盖（重写）这个方法。这常用于保护核心算法不被破坏。
        Father father = new Father();
        father.familyRule(); // 输出：晚上9点前必须回家
        father.hobby(); // 输出：我喜欢钓鱼
        Son son = new Son();
        son.hobby(); // 输出：我喜欢打游戏
    }
}
