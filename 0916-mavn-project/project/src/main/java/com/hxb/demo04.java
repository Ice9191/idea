package com.hxb;

public class demo04 {
    /**
     * 异常：指的是在程序的运行过程中发生的不正常的事件，它会中断正在运行的程序，简单的来说就是程序出现了不正常的情况，异常本身就是java当中对可能出现的问题进行描述的一种对象体现
     *
     * 常见的异常：
     *  1. 除数不能为0（ArithmeticException）
     *  2. 空指针异常（NullPointerException）
     *  3. 数组下标越界（ArrayIndexOutOfBoundsException）
     *  4. 类型转换异常（ClassCastException）
     *
     * 异常的分类：
     *  1. 编译时异常（Exception）：程序在编译过程中发现的异常，又称为受检异常，非RuntimeException均是受检异常
     *  2. 运行时异常（RuntimeException）：又称为非受检异常
     *  3. 错误（Error）：由java虚拟机生成并抛出的异常，程序对其无法做处理
     */

    public static void main(String[] args) {

        int i = 10;
        // java.lang.ArithmeticException 算术异常
        // System.out.println(i/0);
        String s = null;
        // java.lang.NullPointerException 空指针异常
        // System.out.println(s.length());

        int a;
        // 1. 编译时异常
        // System.out.println(a);
        // 2. 运行时异常
        // System.out.println(10/0);
        // 3. Error错误 java.lang.StackOverflowError 栈溢出
        show();
    }

    public static void  show(){
        System.out.println("show...");
        String[] s = new String[1024*1024];
        show();
    }
}
