package com.hxb.demo46;

import java.math.BigInteger;

public class Test {
    /**
     * BigInteger：java中的大整数类
     *
     * BigInteger获取对象的方式：
     *  构造方法：public BigInteger(String val)：获取指定的大整数
     *  静态方法：public static BigInteger valueOf(long val)：静态方法获取BigInteger对象，内部有优化
     *  对象一旦创建，内部记录的值不能改变
     *
     * BigInteger的常用成员方法：
     *  public BigInteger add(BigInteger val)：加法
     *  public BigInteger subtract(BigInteger val)：减法
     *  public BigInteger multiply(BigInteger val)：乘法
     *  public BigInteger divide(BigInteger val)：除法，获取商
     *  public BigInteger[] divideAndRemainder(BigInteger val)：除法，获取商和余数
     *  public boolean equals(Object x)：比较是否相同
     *  public BigInteger pow(int exponent)：次幂
     *  public BigInteger max/min(BigInteger val)：获取最大值/最小值
     */

    static void main() {

        // 利用构造方法获取对象
        // 每一次都是创建了一个新的BigInteger对象
        BigInteger b1 = new BigInteger("9999999999999999999999999999999");
        BigInteger b2 = new BigInteger("9999999999999999999999999999999");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1 == b2); // false

        System.out.println("-----------------");

        // 利用静态方法获取对象
        // 当BigInteger加载到内存的时候，提前把-16 ~ 16之间每一个数字都创建了对象，共33个，放入到数组当中
        // 在范围当中，就不会创建新的对象，而是从数组当中获取
        // 如果不在，此时就会利用构造方法的方式去创建对象
        // 目的：跟Integer是一样的，当使用频率高的时候，节约内存
        // 如果要获取的数字超出了long的取值范围，此时只能利用构造方法的方式去创建对象
        BigInteger b3 = BigInteger.valueOf(16);
        BigInteger b4 = BigInteger.valueOf(16);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b3 == b4); // true

        System.out.println("-----------------");

        // 直接赋值，没有这种方式
        // BigInteger b5 = 200;
    }
}
