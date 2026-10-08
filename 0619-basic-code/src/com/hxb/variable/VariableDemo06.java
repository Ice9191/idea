package com.hxb.variable;

// 确定Scanner类的位置
import java.util.Scanner;

public class VariableDemo06 {
    public static void main(String[] args) {
        /*
        * 键盘录入
        *   第一步：找到Scanner这个打工人
        *   第二步：使用Scanner对象的方法录入数据
        * */

        Scanner sc = new Scanner(System.in);

        /*
        * Scanner类的方法
        *   1.nextInt()：录入一个整数
        *   2.nextDouble()：录入一个浮点数
        *   3.next()：录入一个字符串
        *   4.nextLine()：录入一个字符串，包括空格
        *   5.hasNextInt()：判断是否录入的是一个整数
        * */
        int num1 = sc.nextInt();
//        System.out.println(num1);

        double num2 = sc.nextDouble();
//        System.out.println(num2);

        String str1 = sc.next();
        System.out.println(str1);
    }
}
