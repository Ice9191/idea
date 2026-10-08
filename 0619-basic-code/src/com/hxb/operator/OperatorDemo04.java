package com.hxb.operator;

public class OperatorDemo04 {
    public static void main(String[] args) {
        /**
         * 数字运算：类型不一样的不能运算，需要转成同类型的才能运算
         *      1.隐式转换（在前面补字节）（从取值范围小的类型 -> 取值范围大的类型）
         *          不同类型的数据进行计算，默认采用隐式转换，java自动转换，无需我们写代码
         *              步骤一：如有byte、short类型的数据，先提升为int类型
         *              步骤二：把取值范围小的提升为取值范围大的，再进行运算
         *      2.强制转换（去掉前面的字节）（从取值范围大的类型 -> 取值范围小的类型）
         *          弊端：有可能导致精度丢失
         *          强制转换不会自动触发，需要手动书写代码
         *          书写格式：目标数据类型 变量名 = （目标数据类型）被强制转换的数据
         * */



        byte a = 10;
        byte b = 20;
        int c = a + b;

        byte d = 10;
        double e = 20.3;
        double f = d + e;

        int g = 10;
        byte h = (byte) g;

        byte i = 10;
        byte j = 20;
        byte k = (byte) (i + j);


        // 练习一
        byte newB = 100;
        short newS = 200;
        double newD = 20.3;

        // 请说出下面代码在计算的时候，类型转换的情况
        /**
         * 1. newB + newS
         * 先把byte 类型的100，和short 类型的200，提升为int类型，再进行运算
         * 结果： 300(int)
         *
         *
         * 2. 300(int) + newD
         * int 类型的300会提升为double 类型，变成300.0
         * 结果： 320.3(double)
         */
        double result = newB + newS + newD;
        System.out.println(result); // 320.3
    }
}
