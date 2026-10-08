package com.hxb.demo47;

import java.math.BigDecimal;

public class Test {
    /**
     * 计算机中的小数不精确的根本原因：小数在存储的时候有可能丢失数据
     *
     * BigDecimal类的作用
     *  用来表示很大的小数
     *  用于小数的精确计算
     *
     * BigDecimal类实现精确运算的根本原因：修改了小数的存储规则，遍历字符串，获取每个字符的ASCII码值存到数组中
     * BigDecimal类的存储规则：用byte类型的数组存储数据，避免丢失数据，保证数据的精确运算
     *
     * BigDecimal获取对象的方式：
     *  构造方法：
     *      public BigDecimal(double val)：获取指定的BigDecimal对象（不能用）
     *      public BigDecimal(String val)：获取指定的BigDecimal对象
     *  静态方法：
     *      public static BigDecimal valueOf(long val)：静态方法获取BigDecimal对象，内部有优化
     *  对象一旦创建，内部记录的值不能发生改变
     */

    static void main() {

        // 利用构造方法获取对象
        BigDecimal b1 = new BigDecimal("1.5");
        System.out.println(b1);
        // 错误：传递double类型的数据，会导致数据丢失，因为double类型的数据就是不精确的
        // BigDecimal b2 = new BigDecimal(0.226);
        // System.out.println(b2);
        System.out.println("-----------------");

        // 利用静态方法获取对象
        // 优化机制：0 ~ 10的整数提前创建好，放入到数组当中，
        // 如果在数组当中，就不会创建新的对象，而是从数组当中获取
        // 如果不在，此时就会利用构造方法的方式去创建对象
        BigDecimal b2 = BigDecimal.valueOf(2.5);
        BigDecimal b3 = BigDecimal.valueOf(2.5);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b2 == b3);
        System.out.println("-----------------");

        // 结论：如果当前小数是在double的范围之内，使用静态方法获取对象，否则使用构造方法获取对象（参数必须是字符串类型）
    }
}
