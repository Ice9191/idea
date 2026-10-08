package com.hxb.operator;

public class OperatorDemo07 {
    /**
     * 自增自减运算符
     * ++  变量的值 +1
     * --  变量的值 -1
     */
    public static void main(String[] args) {

        int a = 10;
        /**
         * a++ 和 ++a 都 等同于 a = a + 1;
         */
        a++;
        ++a;
        System.out.println(a); // 12

        /**
         * a-- 和 --a 都 等同于 a = a - 1;
         */
        a--;
        --a;
        System.out.println(a); // 10
    }
}
