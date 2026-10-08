package com.hxb.operator;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        /**
         * 关系运算符 / 比较运算符
         * 结果为 boolean 值，即 true 或 false
         * == a==b 判断a是否等于b
         * != a!=b 判断a是否不等于b
         * > a>b 判断a是否大于b
         * < a<b 判断a是否小于b
         * >= a>=b 判断a是否大于等于b
         * <= a<=b 判断a是否小于等于b
         */

        // 练习1: 键盘录入你和你好友的身高，比一比谁更高？

        // 1. 键盘分别录入你和你好友的身高
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入我的身高：");
        double myHeight = scanner.nextDouble();
        System.out.println("请输入好友的身高：");
        double friendHeight = scanner.nextDouble();

        // 2. 比较
        boolean result = myHeight > friendHeight;
        System.out.println(result);

        // 练习2: 键盘录入一个3位数，判断是否能被3整除

        // 1. 键盘录入一个3位数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个3位数：");
        int num = sc.nextInt();

        // 2. 拆分
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100;

        // 3. 求和
        int sum = ge + shi + bai;

        // 4. 判断是否能被3整除
        boolean ifDivisibleBy3 = sum % 3 == 0;
        System.out.println(ifDivisibleBy3);
    }
}
