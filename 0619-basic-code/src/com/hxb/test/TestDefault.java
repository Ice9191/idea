package com.hxb.test;

import javax.swing.*;
import java.net.Inet4Address;

public class TestDefault {
    // int 和 Integer 的默认值不同，因为 int 是基本类型，而 Integer 是引用类型
    // 类成员变量会有默认值
    private int intVar;
    private Integer integerVar;

    public static void main(String[] args) {
        TestDefault testDefault = new TestDefault();
        System.out.println("int默认值：" + testDefault.intVar); // 0
        System.out.println("Integer默认值：" + testDefault.integerVar); // null

        // 比较==的不同
        // int 是基本类型，比较的是值
        // Integer 是引用类型，比较的是引用地址
        Integer i1 = 100;
        Integer i2 = 100;
        Integer i3 = 200;
        Integer i4 = 200;

        // 场景1：都是Integer，且在缓存范围内 (-128~127) -> 复用对象，地址相同
        System.out.println(i1 == i2); // true （因为地址相同）

        // 场景2：都是Integer，但超出缓存范围 -> 各自new了对象，地址不同
        System.out.println(i3 == i4); // false

        // 场景3：Integer 与 int 比较 -> 自动拆箱，比较数值
        int i5 = 200;
        System.out.println(i3 == i5); // true （Integer自动拆箱成int，再比较值）

        // 安全做法：比较Integer的值，永远用 equals()
        System.out.println(i3.equals(i4)); // true （比较的是值）
    }
}
