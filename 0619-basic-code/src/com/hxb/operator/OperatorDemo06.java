package com.hxb.operator;

public class OperatorDemo06 {
    public static void main(String[] args) {
        // 实现字母的大小写转换，将大写字母转化为小写字母
        // A ---> a

        char str = 'A';

        char result = (char)(str + 32);
        System.out.println(result); // a
    }
}
