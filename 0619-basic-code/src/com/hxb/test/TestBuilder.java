package com.hxb.test;

public class TestBuilder {
    public static void main(String[] args) {
        /**
         * StringBuilder和StringBuffer 可变 修改后不会创建新的字符串对象
         * StringBuilder 是非线程安全的，StringBuffer 是线程安全的
         * StringBuffer 方法都使用 synchronized 同步锁访问，确保线程安全。
         */

        StringBuilder sb = new StringBuilder("hello");
        System.out.println("修改前：" + System.identityHashCode(sb));

        sb.append(" world");

        System.out.println("修改后：" + System.identityHashCode(sb));
        System.out.println("内容：" + sb); // hello world
    }
}
