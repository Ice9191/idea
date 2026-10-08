package com.hxb.demo02;

public class Test {
    static void main() {
        Dog d1 = new Dog();
        d1.setName("小白");
        d1.setAge(5);
        System.out.println(d1.getName() + "，" + d1.getAge());
        d1.eat();
    }
}
