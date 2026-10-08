package com.hxb.operator;

import java.util.Scanner;

public class OperatorDemo02 {
    public static void main(String[] args) {
        /*
         * 键盘录入一个三位数，将其拆分为个位、十位、百位后，打印在控制台*/

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int num = sc.nextInt();

        int ge = num % 10;
        System.out.println("个位：" + ge);
        int sh = num / 10 % 10;
        System.out.println("十位：" + sh);
        int ba = num / 100;
        System.out.println("百位：" + ba);
    }
}
