package com.hxb.operator;

import java.util.Scanner;

public class Demo15 {
    public static void main(String[] args) {

        /**
         * 数组的动态初始化：创建数组的时候，不给数组赋值，等需要的时候再给值
         * 完整的数组动态初始化：数据类型 数组名[] = new 数据类型[数组长度]；
         *                   int[] arr = new int[5];
         */

        int[] arr = new int[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个元素");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
