package com.hxb.operator;

public class Demo13 {
    public static void main(String[] args) {

        /**
         * 循环嵌套：一个循环中再嵌套另一个循环（最重要的是内循环）
         */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                // 不换行
                System.out.print("*");
            }
            // 换行
            System.out.println();
        }

        System.out.println("-----------------");

        for (int j = 0; j < 5; j++) {
            for (int i = 0; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-----------------");

        for (int j = 5; j >= 0; j--) {
            for (int i = 0; i< j; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
