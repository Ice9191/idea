package com.hxb.demo46;

import java.math.BigInteger;

public class Test1 {
    static void main() {

        // 获取对象
        BigInteger b1 = BigInteger.valueOf(100);
        BigInteger b2 = BigInteger.valueOf(3);

        // 加法
        // 在进行计算的时候，不会影响原来的对象，而是产生一个新的对象，存储计算的结果
        BigInteger b3 = b1.add(b2);
        System.out.println(b3);
        System.out.println("-----------------");

        // 减法
        BigInteger b4 = b1.subtract(b2);
        System.out.println(b4);
        System.out.println("-----------------");

        // 乘法
        BigInteger b5 = b1.multiply(b2);
        System.out.println(b5);
        System.out.println("-----------------");

        // 除法（获取商）
        BigInteger b6 = b1.divide(b2);
        System.out.println(b6);
        System.out.println("-----------------");

        // 除法（获取商和余数）
        BigInteger[] b7 = b1.divideAndRemainder(b2);
        System.out.println(b7.length);
        System.out.println(b7[0]); // 商
        System.out.println(b7[1]); // 余数
        System.out.println("-----------------");

        // 比较
        boolean compare = b1.equals(b2);
        System.out.println(compare);
        System.out.println("-----------------");

        // 次幂
        BigInteger b8 = b1.pow(2);
        System.out.println(b8); // 10000
        System.out.println("-----------------");

        // 最大值/最小值
        // 返回最大值/最小值的内存地址，不会创建新的对象
        BigInteger max = b1.max(b2);
        BigInteger min = b1.min(b2);
        System.out.println(max); // 100
        System.out.println(min); // 3
        System.out.println(max == b1); // true
        System.out.println(min == b2); // true
        System.out.println("-----------------");
    }
}
