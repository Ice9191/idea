package com.hxb.demo39;

public class Test1 {
    static void main() {

        // 获取程序刚开始启动的时间
        long start = System.currentTimeMillis();

        // 使用StringBuilder拼接字符串
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000000; i++) {
            sb.append("abc");
        }
        System.out.println(sb);

        // 获取程序结束的时间
        long end = System.currentTimeMillis();

        // 获取程序运行的时间
        System.out.println("程序运行的时间为：" + (end - start) + "毫秒"); // 1秒 = 1000毫秒
    }
}
