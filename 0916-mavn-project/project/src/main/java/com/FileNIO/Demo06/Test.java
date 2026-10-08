package com.FileNIO.Demo06;

public class Test {
    /**
     * 递归：方法调用自身的形式称为方法递归（recursion）
     * 递归的形式：
     *  1. 直接递归：方法自己调用自己
     *  2. 间接递归：方法调用其他方法，其他方法又回调自己
     *
     * 注意：递归如果没有控制好终止，会出现递归死循环，导致栈内存溢出错误
     */

    public static void main(String[] args) {

        method2();
    }

    // 直接方法递归
    public static void method(){
        System.out.println("hello world");
        method();
    }

    // 间接方法递归
    public static void method2(){
        System.out.println("method2");
        method3();
    }

    public static void method3(){
        System.out.println("method3");
        method2();
    }
}
