package com.hxb.demo35;

import java.util.Scanner;

public class Test {
    /**
     * 字符串中的常见成员方法：
     *  public char charAt(int index)  根据索引返回字符
     *  public int length()  返回字符串的长度
     *  数组的长度：数组名.length（属性）
     *  字符串的长度：字符串对象.length（方法）
     */

    static void main() {

        // charAt
        String str = "hello";
        char c = str.charAt(0);
        System.out.println(c);

        // length
        int len = str.length();
        System.out.println(len);


        // 键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.next();

        // 字符串遍历中循环的快速生成方式 s.length().fori
        for (int i = 0; i < s.length(); i++) {
            char cc = s.charAt(i);
            System.out.print(cc);
        }
    }
}
