package com.hxb.operator;

public class OperatorDemo01 {
    public static void main(String[] args) {
        /*
         * 算数运算符：+ - * / % ++ -- */

        // 1.整数计算
        int a = 10;
        int b = 20;
        System.out.println(a + b); // 30
        System.out.println(a - b); // -10
        System.out.println(a * b); // 200
        // 整数相除结果还是整数，就是商
        System.out.println(a / b); // 0
        System.out.println(a % b); // 10

        System.out.println("-----------------");

        // 2.浮点数计算
        // 浮点数直接参与计算，结果有可能不精确
        double c = 10.0;
        double d = 3.0;
        System.out.println(c + d); // 13.0
        System.out.println(c - d); // 7.0
        System.out.println(c * d); // 30.0
        // 浮点数相除结果还是浮点数，就是商
        System.out.println(c / d); // 3.3333333333333335
        System.out.println(c % d); // 1.0
    }
}
