package com.hxb.operator;

import java.util.Scanner;

public class OperatorDemo03 {
    public static void main(String[] args) {
        /*
         * 给定秒数seconds，将其转换为对应的小时数、分钟数和秒数，使得总时间不变，但分钟数和秒数都不超过59*/

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个秒数");
        int sum = sc.nextInt();

        // 计算小时数
        int hours = sum / 3600;
        System.out.println("小时数：" + hours);

        // 计算分钟数
        int minutes = sum % 3600 / 60;
        System.out.println("分钟数：" + minutes);

        // 计算秒数
        int seconds = sum % 3600 % 60;
        System.out.println("秒数：" + seconds);

        System.out.println(hours + "小时" + minutes + "分" + seconds + "秒");
    }
}
