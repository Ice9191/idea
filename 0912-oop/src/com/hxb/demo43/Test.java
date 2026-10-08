package com.hxb.demo43;

public class Test {
    /**
     * System也是一个工具类，提供了一些与系统相关的方法
     *  public static void exit(int status)：终止当前运行的java虚拟机
     *  public static long currentTimeMillis()：返回当前系统的时间（毫秒值形式）
     *  public static void arraycopy(数据源数组, 起始索引, 目的地数组, 起始索引, 拷贝个数)：数组拷贝
     */

    static void main() {

        // exit
        // 参数：0 -- 正常终止 | 非0 -- 异常终止
        System.out.println(111);
        // System.exit(0); // 虚拟机正常终止，后面代码不会执行了
        System.out.println(222);

        System.out.println("-----------------");

        // currentTimeMillis
        // 从1970年1月1日0时0分0秒开始，到当前时间的毫秒数
        // 作用：用于计算程序运行时间
        long l = System.currentTimeMillis();
        System.out.println(l);

        System.out.println("-----------------");

        // arraycopy
        // 原数组
        int[] arr = {1, 2, 3, 4, 5};
        // 目标数组
        int[] newArr = new int[5];
        // 数组的拷贝
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }

        System.out.println("-----------------");

        int[] newArr2 = new int[10];
        System.arraycopy(arr, 1, newArr2, 5, 4);
        for (int i = 0; i < newArr2.length; i++) {
            System.out.println(newArr2[i]);
        }
    }
}
