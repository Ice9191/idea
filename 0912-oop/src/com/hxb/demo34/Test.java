package com.hxb.demo34;

public class Test {
    /**
     * 字符串中的常见成员方法（比较）
     *
     * ==号 比较的是：变量里面记录的数据
     * 基本数据类型：比较的是真实的数据
     * 引用数据类型：比较的是地址值
     *
     * 如果要比较的是字符串的内容：
     * boolean equals方法(要比较的字符串)          完全一样结果为true，否则为false
     * boolean equalsIgnoreCase(要比较的字符串)   忽略大小写比较
     */

    static void main() {

        // 字符串比较的两种方式
        // 第一个方法：equals方法完全一致
        String s1 = "hello";
        String s2 = "Hello";
        boolean b1 = s1.equals(s2);
        System.out.println(b1);

        // 第二个方法：equalsIgnoreCase方法忽略大小写
        boolean b2 = s1.equalsIgnoreCase(s2);
        System.out.println(b2);
    }
}
