package com.hxb.operator;

public class Demo01 {
    /**
     * 赋值运算符
     * = 直接赋值 a = 10; 将 10 赋值给a变量
     * += 累加赋值 a += b; 将 a + b 的值赋值给a变量
     * -= 累减赋值 a -= b; 将 a - b 的值赋值给a变量
     * *= 累乘赋值 a *= b; 将 a x b 的值赋值给a变量
     * /= 累除赋值 a /= b; 将 a ÷ b 的商赋值给a变量
     * %= 累余赋值 a %= b; 将 a ÷ b 的余数值赋值给a变量
     */

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        a += b;
        System.out.println(a); // 30
        System.out.println(b); // 20

        a = 10;
        a -= b;
        System.out.println(a); // -10

        a = 10;
        a *= b;
        System.out.println(a); // 200

        a = 10;
        a /= b;
        System.out.println(a); // 0

        a = 10;
        a %= b;
        System.out.println(a); // 10
    }
}
