package com.hxb.test;

// 引用类型成员变量
class Address implements Cloneable {
    String city;
    public Address(String city){
        this.city = city;
    }

    // 重写 clone 方法用于深复制


}

public class CopyDemo {
    /**
     * 浅复制：只复制对象本身的“基本类型”和“引用地址”。新对象和原对象共享内部的引用类型数据（指向堆内存中的同一个实例）。
     * 深复制：不仅复制对象本身，还会递归复制所有引用类型的成员变量，新对象和原对象在堆内存中完全独立。
     */
}
