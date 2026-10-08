package com.hxb.demo24;

public class Rabbit extends Animal {
    @Override
    public void eat() {
        System.out.println("兔子吃胡萝卜");
    }

    public Rabbit() {
    }

    public Rabbit(String name, String color) {
        super(name, color);
    }
}
