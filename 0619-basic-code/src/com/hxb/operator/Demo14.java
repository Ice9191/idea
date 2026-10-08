package com.hxb.operator;

public class Demo14 {
    public static void main(String[] args) {

        /**
         * 数组：是一种容器，可以用来存储同种数据类型的多个值
         * 数组的静态初始化：创建数组的时候，直接给数组赋值
         * 完整的数组初始化：数据类型 数组名[] = new 数据类型[]{数组元素1, 数组元素2, 数组元素3, ...}；
         *                int[] arr = new int[]{1, 2, 3, 4, 5};
         * 简写的数组初始化：数据类型 数组名[] = {数组元素1, 数组元素2, 数组元素3, ...}；
         *                int[] arr = {1, 2, 3, 4, 5};
         * 数组的特点：
         * 1. 连续的内存空间
         * 2. 一旦定义，长度就不能改变
         */

        int[] arr = {1,2,3,4,5};
        double[] arr2 = {1.1, 2.2, 3.3, 4.4, 5.5};
        String[] arr3 = {"a", "b", "c", "d", "e"};
        System.out.println(arr3[0]);

        // 数组的遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
