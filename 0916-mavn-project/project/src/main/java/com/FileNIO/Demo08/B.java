package com.FileNIO.Demo08;

import java.io.*;

public class B {
    /**
     * 文件字节输入流：一次读取完全部字节
     *  方式一：自己定义一个字节数组与被读取的文件大小一样大，然后使用该字节数组，一次读完文件的全部字节
     *  方式二：java官方为InputStream类提供了如下方法，可以直接把文件的全部字节读取到一个字节数组中返回
     *      public byte[] readAllBytes() throws IOException：直接将当前字节输入流对应的文件对象的字节数据装到一个字节数组中返回
     *
     * 问题：如果文件过大，创建的字节数组就会过大，可能引起内存溢出
     */

    public static void main(String[] args) throws IOException {

        // test1();
        test2();
    }

    public static void test1() throws IOException {
        // 一次性读取完文件的全部字节到一个字节数组中去
        // 创建一个字节输入流管道与源文件连通
        InputStream fis = new FileInputStream("0916-mavn-project/project/src/main/java/com/FileNIO/Demo08/ddd.txt");

        // 准备一个字节数组，大小与文件的大小正好一样大
        long length = new File("0916-mavn-project/project/src/main/java/com/FileNIO/Demo08/ddd.txt").length();
        byte[] buffer = new byte[(int) length];

        // 读取多少，倒出多少
        int i = fis.read(buffer);
        String s = new String(buffer, 0, i);

        System.out.println(length);
        System.out.println(i);
        System.out.println(s);
    }

    public static void test2() throws IOException {
        InputStream fis = new FileInputStream("0916-mavn-project/project/src/main/java/com/FileNIO/Demo08/ddd.txt");
        byte[] bytes = fis.readAllBytes();
        String s = new String(bytes);
        System.out.println(s);
    }
}
