package com.hxb.operator;

import java.util.Scanner;

public class Demo09 {
    public static void main(String[] args) {

        /**
         * switch语句新特性（jdk14+能用）
         * 1. 箭头表达式，case穿透不可用
         * 2. case后面可以写多个值
         * 3. switch可以有运行结果
         * 4. yield关键字
         */

        // 练习：模拟计算器，实现加减乘除四则运算
        int a = 10;
        int b = 5;
        Scanner sc = new Scanner(System.in);
        String operator = sc.nextLine();

        int result = switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> 0;
        };

        System.out.println(result);
    }
}
