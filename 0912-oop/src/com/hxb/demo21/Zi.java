package com.hxb.demo21;

public class Zi extends Fu {
    String name = "Zi";

    public void ziShow() {
        System.out.println("子类的ziShow方法被调用");
    }

    @Override
    public void show() {
        System.out.println("子类的show方法被调用");
    }
}
