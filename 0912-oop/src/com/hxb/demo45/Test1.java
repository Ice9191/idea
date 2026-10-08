package com.hxb.demo45;

import com.hxb.demo26.Inter;

public class Test1 {
    /**
     * Integer常见的成员方法：
     *  public static int valueOf(int i)：把基本数据类型变成包装类
     *  public int intValue()：把包装类变回基本数据类型int
     *  public static int parseInt(String s)：把字符串形式的整数变成int类型
     *  public static String toBinaryString(int i)：获取二进制
     *  public static String toOctalString(int i)：获取八进制
     *  public static String toHexString(int i)：获取十六进制
     */

    static void main() {

        // valueOf方法
        Integer i = Integer.valueOf(100);
        System.out.println(i);

        System.out.println("-----------------");

        // intValue方法
        // 把对象里面的属性值给获取出来
        int j = i.intValue();
        System.out.println(j);

        System.out.println("-----------------");

        // parseInt方法
        // 如果字符串里面有非数字字符，那么会报错
        int k = Integer.parseInt("123");
        System.out.println(k + 111);

        System.out.println("-----------------");

        // toBinaryString方法
        String s = Integer.toBinaryString(100);
        System.out.println(s);

        System.out.println("-----------------");

        // toOctalString方法
        String s1 = Integer.toOctalString(100);
        System.out.println(s1);

        System.out.println("-----------------");

        // toHexString方法
        String s2 = Integer.toHexString(100);
        System.out.println(s2);
    }
}
