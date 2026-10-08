package com.hxb.demo24;

public class Frog extends Animal implements Swim {


    @Override
    public void eat() {
        System.out.println("青蛙吃虫");
    }

    @Override
    public void swim() {
        System.out.println("青蛙蛙泳");
    }

    public Frog() {
    }

    public Frog(String name, String color) {
        super(name, color);
    }
}
