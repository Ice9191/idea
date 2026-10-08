package com.hxb.operator;

public class Demo18 {
    public static void main(String[] args) {
        /**
         * 方法重载：一个类中可以有多个同名方法，但是参数列表不同（个数、类型、顺序都要匹配，形参名无所谓），不看返回值
         */

        int a = 10;
        int b = 20;
        System.out.println(sum(a, b));

        // 方法的重载，一般不会写成顺序不同的方式，容易让调用者混淆
    }

    // 1usage的意思就是有一个地方正在使用这个方法
    // 0usage的意思就是没有地方使用这个方法
    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, int b) {
        return a + b;
    }

    public static double sum(int a, double b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }
}
