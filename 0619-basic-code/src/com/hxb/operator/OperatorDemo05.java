package com.hxb.operator;

public class OperatorDemo05 {

    public static void main(String[] args) {
        // 练习二
        // 检查下面代码，程序运行时是否会报错，如果会，请说明错误原因
        short s1 = 100;
        short s2 = 200;
        /**
         * 实际上是：int + int = int
         * 修改方案1:强制类型转换
         *  byte result = (byte) (s1 + s2);
         *  结果：44
         *  有问题（可能会改变原有数据）： 300 的二进制 ： 00000000 00000000 00000001 00101100
         *          强制转换byte： 00101100 = 44
         */
        byte result = (byte) (s1 + s2);
        System.out.println(result);

        /**
         * 修改方案2:使用int类型存储结果
         */
        int result2 = s1 + s2;
        System.out.println(result2); // 300
    }
}
