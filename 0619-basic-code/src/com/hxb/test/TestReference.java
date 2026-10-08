package com.hxb.test;

public class TestReference {
    /**
     * ==：对于引用数据类型，== 比较的是栈内存中的引用地址
     * equals()：对于引用数据类型，equals() 比较的是堆内存中的引用地址
     */
    public static void main(String[] args) {
        // 场景1:字面量的创建（存在字符串常量池中）
        String s1 = "hello";
        String s2 = "hello";

        // 场景2:new 关键字创建（强制存在堆内存中新建对象）
        String s3 = new String("hello");
        String s4 = new String("hello");

        // ------ 比较 ------
        System.out.println(s1 == s2);
        // true。因为 s1 和 s2 指向常量池中的同一个 "hello" 对象。

        System.out.println(s1 == s3);
        // false。因为 s1 指向常量池，s3 指向堆中新建的对象，地址不同。

        System.out.println(s3 == s4);
        // false。因为 s3 和 s4 是两个独立 new 出来的对象，地址不同。

        System.out.println(s1.equals(s3));
        // true。因为 String 重写了 equals，比较的是字符串内容，都是 "hello"。

        System.out.println(s3.equals(s4));
        // true。内容都是 "hello"，所以为 true。
    }
}
