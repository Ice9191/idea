package com.hxb.demo25;

public interface Inter {
    int A = 100;

    void method();
    void method01();

    void eat();

    default void interShow() {
        System.out.println("interShow");
    }
}
