package com.hxb.test;

// 子类：狗（继承动物类）
public class Dog extends Animal {
    // 狗自动拥有动物类的name和eat方法
    // 但是狗可以有自己的方法，比如bark
    public void bark() {
        System.out.println(name + "汪汪叫！");
    }
}
