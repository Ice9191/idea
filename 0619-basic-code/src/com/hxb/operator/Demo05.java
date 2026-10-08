package com.hxb.operator;

public class Demo05 {
    public static void main(String[] args) {

        /**
         * 三元运算符
         * 语法：条件表达式 ? 表达式1 : 表达式2;
         * 功能：先判断条件表达式，如果为true，就执行表达式1，否则执行表达式2
         */

        // 练习：利用三元运算符比较两个整数的大小

        // 1.定义两个整数变量
        int a = 100;
        int b = 20;

        // 2. 利用三元运算符比较两个整数的大小
        int max = a > b ? a : b;
        System.out.println("两个整数中的较大值是：" + max);
    }
}
