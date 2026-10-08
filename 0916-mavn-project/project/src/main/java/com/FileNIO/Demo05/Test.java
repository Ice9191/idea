package com.FileNIO.Demo05;

import java.io.File;

public class Test {
    /**
     * File提供的遍历文件夹的方法
     *  public String[] list()：获取当前目录下所有的"一级文件名称"到一个字符串数组中去返回
     *  public File[] listFiles()：（递归）获取当前目录下所有的"一级文件对象"到一个File数组中去返回
     */

    public static void main(String[] args) {

        // 遍历当前目录下所有的"一级文件名称"
        String[] list = new File("/Users/hxb/Downloads").list();
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("-----------------");

        // 遍历当前目录下所有的"一级文件对象"
        File[] listFiles = new File("/Users/hxb/Downloads").listFiles();
        for (File file : listFiles) {
            System.out.println(file.getAbsolutePath());
        }
    }
}
