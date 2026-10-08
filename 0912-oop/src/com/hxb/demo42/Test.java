package com.hxb.demo42;

import java.util.Random;

public class Test {
    /**
     * Math：是一个帮助我们用于进行数学计算的工具类
     * 方法：
     *  public static int abs(int a)：获取参数绝对值
     *  public static double ceil(double a)：向上取整
     *  public static double floor(double a)：向下取整
     *  public static int round(float a)：四舍五入
     *  public static int max(int a, int b)：获取两个int值中的较大值
     *  public static double pow(double a, double b)：返回a的b次幂的值（比如2的3次幂，2*2*2）
     *  public static double random()：返回值为double的随机值，范围[0.0, 1.0)
     */

    static void main() {
        // 不能创建Math类的对象
        // Math a = new Math();

        // abs
        int abs = Math.abs(-10);
        System.out.println(abs);

        System.out.println("-----------------");

        // ceil
        System.out.println(Math.ceil(10.11)); // 11.0
        System.out.println(Math.ceil(10.55)); // 11.0

        System.out.println("-----------------");

        // floor
        System.out.println(Math.floor(10.11)); // 10.0
        System.out.println(Math.floor(10.55)); // 10.0

        System.out.println("-----------------");

        // round
        // 如果负数的小数位刚好是.5的时候，采取舍去操作
        // round规则：返回与参数最接近的整数，如果有多个则返回正无穷大方向
        // ---(-2)-----(-1)--------0------1-------2-------3--------4--------->
        System.out.println(Math.round(10.11)); // 10
        System.out.println(Math.round(10.55)); // 11
        System.out.println(Math.round(-10.11)); // -10
        System.out.println(Math.round(-10.55)); // -11
        System.out.println(Math.round(-10.5)); // -10

        System.out.println("-----------------");

        // max
        System.out.println(Math.max(10, 20)); // 20
        // min
        System.out.println(Math.min(10, 20)); // 10

        System.out.println("-----------------");

        // pow
        System.out.println(Math.pow(2, 3)); // 8.0
        // pow开根号
        // 0.5：获取4的二分之一次方
        System.out.println(Math.pow(4, 0.5)); // 2.0
        // -0.5：获取4的负二分之一次方
        System.out.println(Math.pow(4, -0.5)); // 0.5

        System.out.println("-----------------");

        // 平方根sqrt
        System.out.println(Math.sqrt(4)); // 2.0
        // 立方根cbrt
        System.out.println(Math.cbrt(27)); // 3.0

        System.out.println("-----------------");

        // random
        // [0.0, 1.0)
        // 不常用，用Random就可以了
        // 底层还是Random
        System.out.println(Math.random());

        System.out.println("-----------------");
    }
}
