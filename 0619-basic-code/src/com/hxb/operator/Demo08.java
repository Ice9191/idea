package com.hxb.operator;

import java.util.Scanner;

public class Demo08 {
    public static void main(String[] args) {

        /**
         * switch语句
         * switch (表达式) {
         *     case 值1:
         *         代码块1;
         *         break;
         *     case 值2:
         *         代码块2;
         *         break;
         *     default:
         *         代码块n;
         * }
         * 执行流程：
         * 1.根据表达式的值，判断是否与case后的值相等
         * 2.如果相等，执行对应的代码块，遇到break结束switch语句
         * 3.如果不相等，继续判断下一个case
         * 4.如果没有匹配的case，执行default代码块
         * */

        // 1.键盘录入星期数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数");
        int week = sc.nextInt();

        // 2.利用switch语句完成减肥计划
        switch (week) {
            // case的值必须是常量
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("骑行");
                break;
                // 会触发case穿透，继续执行下一个case的代码块
            case 4:
                System.out.println("拳击");
            case 5:
                System.out.println("篮球");
                break;
            case 6:
                System.out.println("足球");
                break;
            case 7:
                System.out.println("休息");
                break;
            default:
                System.out.println("星期数不合法");
                break;
        }
    }
}
