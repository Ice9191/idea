package com.hxb.operator;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        /**
         * 逻辑运算符
         * & 与（而且） 同时成立才是符合要求的
         * | 或（或者） 只要有一个符合要求即可
         * ! 非（取反） 取反操作，将 true 变为 false，false 变为 true
         */

        // 练习1: 键盘录入一个整数，判断这个数字是否在1～10之间
        // 1. 键盘录入一个整数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = scanner.nextInt();

        // 2. 判断是否在1～10之间
        boolean result = num > 1 & num < 10;
        System.out.println(result);

        // 练习2: 键盘录入一个整数，判断这个数字是否不在1～10之间
        // 1. 键盘录入一个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number = sc.nextInt();

        // 2. 判断是否不在1～10之间
        boolean result2 = number <= 1 | number >= 10;
        System.out.println(result2);
    }
}
