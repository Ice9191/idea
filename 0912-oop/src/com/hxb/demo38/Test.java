package com.hxb.demo38;

public class Test {
    /**
     * 其他字符串的方法
     * contains：是否包含
     * StartsWith/EndsWith：判断开头/判断结尾
     * indexOf/lastIndexOf：查找
     * isEmpty：判断是否为空
     * toCharArray：将字符串转换为字符数组
     * toUpperCase/toLowerCase：将字符串转换为大写/小写
     * trim：去掉字符串首尾的空格
     */

    static void main() {

        String str = "hello";

        // 是否包含
        boolean b = str.contains("he");
        System.out.println(b);

        // 判断开头、判断结尾
        boolean b1 = str.startsWith("h");
        System.out.println(b1);
        boolean b2 = str.startsWith("l", 2);
        System.out.println(b2);
        boolean b3 = str.endsWith("o");
        System.out.println(b3);

        // 查找
        // 查找的是当前字符或者字符串第一次出现的索引位置，如果没有找到，返回-1，不存在负数索引
        int index = str.indexOf("l");
        System.out.println(index);
        int lastIndex = str.lastIndexOf("p");
        System.out.println(lastIndex);

        // 判断是否为空
        String str1 = "";
        boolean b4 = str1.isEmpty();
        System.out.println(b4);

        // 将字符串转换为字符数组
        // "hello" -> ['h', 'e', 'l', 'l', 'o']
        char[] cha = str.toCharArray();
        for (int i = 0; i < cha.length; i++) {
            System.out.println(cha[i]);
        }

        // 将字符串转换为大写/小写
        String upperCase = str.toUpperCase();
        System.out.println(upperCase);
        String s = "HELLO";
        String lowerCase = s.toLowerCase();
        System.out.println(lowerCase);

        // 去掉字符串首尾的空格
        String trim = "  he l lo  ";
        System.out.println(trim.trim());
    }
}
