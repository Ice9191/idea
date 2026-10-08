package com.hxb.demo39;

public class Test {
    /**
     * StringBuilder：是字符串的一个工具类，可以让我们拼接字符串的时候效果更高
     *
     * 原始的拼接字符串的方式会产生很多冗余的字符串对象，导致内存浪费和性能问题
     * StringBuilder类可以避免这个问题，因为它内部使用了一个字符数组来存储字符串，每次拼接字符串的时候，只需要在字符数组的末尾添加新的字符即可
     *
     * StringBuilder类的构造方法：
     *  public StringBuilder()：创建StringBuilder容器，不含有任何内容
     *  public StringBuilder(String str)：创建StringBuilder容器，包含指定的内容
     *
     * StringBuilder类的常见成员方法：
     *  StringBuilder append(任意类型)：在StringBuilder容器的末尾添加指定的内容
     *  StringBuilder reverse()：反转当前StringBuilder容器的内容
     *  int length()：返回当前StringBuilder容器的长度
     *  String toString()：将当前StringBuilder容器的内容转回字符串对象
     *  StringBuilder insert(任意类型)：在指定位置插入指定的内容
     */

    static void main() {

        // 获取程序刚开始启动的时间
        long start = System.currentTimeMillis();

        String s = "";
        for (int i = 0; i < 100000; i++) {
            s += "abc";
        }
        System.out.println(s);

        // 获取程序结束的时间
        long end = System.currentTimeMillis();

        // 获取程序运行的时间
        System.out.println("程序运行的时间为：" + (end - start) + "毫秒"); // 1秒 = 1000毫秒
    }
}
