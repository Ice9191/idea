package com.collection.demo07;

public abstract class Cat extends Animal {
    /**
     * 继承一个抽象类的两种解决方案：
     *  1. 继承抽象类，重写抽象类中的抽象方法
     *  2. 本身Cat也是一个抽象的，让Cat的子类再重写抽象方法
     *  此时采用第二种处理方案
     *      因为Cat的两个子类中eat()方法体还是不一样的
     */
    public Cat(){}

    public Cat(String name, int age){
        super(name, age);
    }
}
