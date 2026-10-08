package com.hxb.variable;

import java.util.Scanner;

public class VariableDemo07 {
    public static void main(String[] args) {
        /*
         * 键盘录入求和
         * */

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("两个整数的和为：" + sum);
    }
}
