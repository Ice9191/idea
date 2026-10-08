package com.hxb.demo25;

public class A extends Person implements Inter, Inter01 {
    // 如果一个类实现了多个接口，那么就要重写多个接口中的所有的抽象方法

    /**
     * 注意：
     *  1. 如果父类Person也是一个抽象类的话，那么在子类中，要么把所有的抽象方法进行重写（经常使用），要么子类声明为抽象类
     *  2. 如果在重写的时候出现了重复的抽象方法，此时我们只要重写一次就可以了
     */
    @Override
    public void method() {
        System.out.println("A类实现method方法");
    }

    @Override
    public void method01() {
        System.out.println("A类实现method01方法");
    }

    @Override
    public void function() {
        System.out.println("A类实现function方法");
    }

    @Override
    public void function01() {
        System.out.println("A类实现function01方法");
    }

    @Override
    public void eat() {
        System.out.println("A类吃");
    }
}
