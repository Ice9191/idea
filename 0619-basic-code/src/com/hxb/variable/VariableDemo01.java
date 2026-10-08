package com.hxb.variable;

public class VariableDemo01 {
    public static void main(String[] args) {
        /* 微信余额：0元
        支付宝余额：10元
        银行卡余额：20元
        问题一：请问现在一共多少钱？
        问题二：微信收了10元红包，又发了2元红包，余额多少? */

        double a = 0;
        double b = 10;
        double c = 20;

        // 问题一：请问现在一共多少钱？
        System.out.println(a + b + c);

        // 问题二：微信收了10元红包，又发了2元红包，余额多少?
        System.out.println(a + 10 - 2);
    }
}
