package com.hxb.demo36;

public class Test {
    /**
     * 数据脱敏：是一种有效的数据保护手段，能够降低数据泄露的风险，保护用户的隐私
     * String substring(int beginIndex, int endIndex)  截取（包含beginIndex，不包含endIndex，只有返回值才是截取的小串，对原字符串没有影响）
     * String substring(int beginIndex)  截取到末尾（包含beginIndex）
     */

    static void main() {

        // 定义一个字符型
        String str = "hello";

        // 截取
        String sub = str.substring(2, 4);
        System.out.println(sub);

        // 截取到末尾
        String sub2 = str.substring(2);
        System.out.println(sub2);

        // 原字符串没有改变
        System.out.println(str);

        // 练习
        String username = "admin";
        // charAt(0)
        char firstChar = username.charAt(0);
        String encryption = firstChar + "****";
        System.out.println(encryption);
        // subString(0,1)
        String firstChar1 = username.substring(0, 1);
        String encryption1 = firstChar1 + "****";
        System.out.println(encryption1);
    }
}
