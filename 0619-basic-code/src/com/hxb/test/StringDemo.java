package com.hxb.test;

public class StringDemo {
    public static void main(String[] args) {
        /**
         * String不是基本数据类型，而是一个类；String是不
         * 可变的（只要创建，内容就不能改变，任何修改操作都会返回一个新字符串）。
         */

        String str1 = "  Hello Java World!  ";
        String str2 = "hello java world!";

        /**
         * 第一类：判断和比较（返回值往往是boolean）
         * equals()：比较字符串内容是否相同
         * equalsIgnoreCase()：比较字符串内容是否相同，不区分大小写
         * contains()：判断字符串是否包含指定的子字符串
         * isEmpty()：判断字符串是否为空
         */

        System.out.println(str1.trim().equalsIgnoreCase(str2)); // true
        System.out.println(str1.contains("Java")); // true
        System.out.println(" ".isEmpty()); // false（有空格，不是空字符串）

        /**
         * 第二类：查找与获取（返回值往往是 int 或 char）
         * length()：获取字符串的长度
         * charAt()：获取指定索引的字符
         * indexOf()：获取子字符串第一次出现的索引
         * lastIndexOf()：获取子字符串最后一次出现的索引
         */

        System.out.println(str1.length());
        System.out.println(str1.charAt(2));
        System.out.println(str1.indexOf("H")); // 空格算一个字符，所以是2
        System.out.println(str1.lastIndexOf("a")); // 从后往前找，所以是14

        /**
         * 第三类：转换与修改（返回值往往是新的 String）
         * toLowerCase()：将字符串转换为小写
         * toUpperCase()：将字符串转换为大写
         * trim()：去掉字符串首尾的空格
         * replace()：替换所有指定的字符或子串
         * substring()：截取子串（包含 begin，不包含 end）
         */

        System.out.println(str1.toUpperCase()); // HELLO JAVA WORLD!
        System.out.println(str1.toLowerCase()); // hello java world!
        System.out.println(str1.trim()); // Hello Java World!
        System.out.println(str1.replace("Java", "Python")); // Hello Python World!
        System.out.println(str1.substring(str1.indexOf("J"), str1.lastIndexOf("a") + 1)); // Java

        /**
         * 第四类：拆分与拼接
         * split()：将字符串拆分成字符串数组
         * concat()：将两个字符串拼接起来
         * join()：将字符串数组拼接成一个字符串
         */

        String str3 = "Apple, Banana, Orange";
        String[] fruits = str3.split(", ");
        for (String item : fruits) {
            System.out.println(item);
        }
        System.out.println(str3.concat(", Peach")); // Apple, Banana, Orange, Peach
    }
}
