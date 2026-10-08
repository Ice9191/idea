package com.hxb.test;

public class TestBasic {
    /**
     * ==：对于基本数据类型，== 比较的是值
     * equals()：对于基本数据类型，equals() 不能用
     */

    public static void main(String[] args) {
        // 场景1:基本数据类型 == 比较的是值
        int a = 10;
        int b = 10;
        int c = 20;
        System.out.println(a == b); // 输出：true
        System.out.println(a == c); // 输出：false
    }
}
