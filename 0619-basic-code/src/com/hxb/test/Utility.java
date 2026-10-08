package com.hxb.test;

public final class Utility {
    // 如果一个类被 final 修饰，那它就变成了“断子绝孙”类，不允许其他类继承它。Java 中最经典的例子就是 String 类（因为字符串不可变，安全性高）。

    public void printHello() {
        System.out.println("Hello, World!");
    }

    // class MyUtility extends Utility { } // 这行会报错！因为 Utility 是 final 的，无法继承
}
