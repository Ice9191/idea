package com.hxb.demo47;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test1 {
    /**
     * BigDecimal类的成员方法：
     *  public BigDecimal add(BigDecimal val)：加法
     *  public BigDecimal subtract(BigDecimal val)：减法
     *  public BigDecimal multiply(BigDecimal val)：乘法
     *  public BigDecimal divide(BigDecimal val)：除法，获取商
     *  public BigDecimal[] divideAndRemainder(BigDecimal val)：除法，获取商和余数
     *  public boolean equals(Object x)：比较
     *  public BigDecimal pow(int exponent)：次方
     *  public BigDecimal max/min(BigDecimal val)：获取最大值/最小值
     */

    static void main() {

        // 获取对象
        BigDecimal b1 = new BigDecimal("100.0");
        BigDecimal b2 = new BigDecimal("3.0");

        // 加法
        BigDecimal b3 = b1.add(b2);
        System.out.println(b3);
        System.out.println("-----------------");

        // 减法
        BigDecimal b4 = b1.subtract(b2);
        System.out.println(b4);
        System.out.println("-----------------");

        // 乘法
        BigDecimal b5 = b1.multiply(b2);
        System.out.println(b5);
        System.out.println("-----------------");

        // 除法
        /*BigDecimal b6 = b1.divide(b2); // 无限循环小数报错
        System.out.println(b6);*/
        BigDecimal[] b7 = b1.divideAndRemainder(b2);
        BigDecimal b8 = b1.divide(b2, 2, RoundingMode.HALF_UP); // 保留2位小数，四舍五入
        System.out.println(b7[0]); // 商
        System.out.println(b7[1]); // 余数
        System.out.println(b8); // 33.33
        System.out.println("-----------------");
    }
}
