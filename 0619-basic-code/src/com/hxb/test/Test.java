package com.hxb.test;

// 1. 定义两个接口
interface Runner {
    void run();
}

interface Flyer {
    void fly();
}

// 2.使用 implements 实现多个接口（用逗号隔开）
// 注意：实现了接口，就必须重写里面的所有方法，否则报错！
class SuperMan implements Runner, Flyer{
    @Override
    public void run(){
        System.out.println("超人正在跑步");
    }

    @Override
    public void fly(){
        System.out.println("超人正在飞行");
    }
}

public class Test {
    /**
     * implements 是 Java 中的一个关键字，中文直译为“实现”，专门用于类（Class）去实现接口（Interface）。
     * 可以同时实现多个接口，用逗号隔开。
     * 接口（Interface）：就像一份“合同”或“规范”，里面只列出要求（抽象方法），但不干活。
     */
    public static void main(String[] args) {
        SuperMan superMan = new SuperMan();
        superMan.run();
        superMan.fly();
    }
}