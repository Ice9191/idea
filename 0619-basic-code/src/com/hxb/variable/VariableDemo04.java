package com.hxb.variable;

import java.util.concurrent.Flow;

public class VariableDemo04 {
    public static void main(String[] args) {
        /*
        java语言数据类型的分类
        1.8种基本数据类型
            整数类型：byte, short, int, long
            浮点数类型：float, double
            字符类型：char
            布尔类型：boolean
            取值范围大小关系：byte < short < int < long < float < double
        2.引用数据类型
         */

        // byte b = 130;
        byte b = 127;
        System.out.println(b);

        short s = 32767;
        System.out.println(s);

        int i = 2147483647;
        System.out.println(i);

        // long类型变量必须以L结尾
        long l = 9223372036854L;
        System.out.println(l);

        // float类型变量必须以F结尾
        float f = 1.1F;
        System.out.println(f);

        double d = 1.1;
        System.out.println(d);

        char c = 'a';
        System.out.println(c);

        boolean bool = true;
        System.out.println(bool);
    }
}

