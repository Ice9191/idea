package com.hxb.test;

public class TestString {
    public static void main(String[] args) {
        /**
         * String 不可变 进行拼接等修改后实际会创建一个新的字符串对象
         * String 的线程是安全的，多个线程同时操作同一个 String 对象也不会出现问题。
         */

        String s = "hello";
        // 打印当前s在内存中的“身份证号”（哈希值转十六进制）
        System.out.println("修改前：" + System.identityHashCode(s));

        // 修改s的值
        s += "world";

        System.out.println("修改后：" + System.identityHashCode(s));
        System.out.println(s); // hello world
    }
}
