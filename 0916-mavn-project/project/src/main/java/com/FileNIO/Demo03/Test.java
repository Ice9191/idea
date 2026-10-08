package com.FileNIO.Demo03;

import java.io.File;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Test {
    /**
     * File提供的判断文件类型、获取文件信息功能的方法
     *  public boolean exists()：判断当前文件对象，对应的文件路径是否存在，存在返回true，不存在返回false
     *  public boolean isFile()：判断当前文件对象指代的是否是文件，是返回true，不是返回false
     *  public boolean isDirectory()：判断当前文件对象指代的是否是文件夹，是返回true，不是返回false
     *  public String getName()：获取文件的名称（包含后缀名，如：aaa.txt，返回：aaa.txt）
     *  public long length()：获取文件的大小（单位：字节）
     *  public long lastModified()：获取文件的最后修改时间（单位：毫秒）
     *  public String getPath()：获取创建文件对象时，使用的路径
     *  public String getAbsolutePath()：获取文件的绝对路径
     */

    public static void main(String[] args) {
        File f1 = new File("0916-mavn-project/project/src/main/java/com/FileNIO/Demo02/aaa.txt");

        // 路径是否存在
        System.out.println(f1.exists());
        System.out.println("-----------------");

        // 是否是文件
        System.out.println(f1.isFile());
        System.out.println("-----------------");

        // 是否是文件夹
        System.out.println(f1.isDirectory());
        System.out.println("-----------------");

        // 获取文件的名称（包含后缀名，如：aaa.txt，返回：aaa.txt）
        System.out.println(f1.getName());
        System.out.println("-----------------");

        // 获取文件的大小（单位：字节）
        System.out.println(f1.length());
        System.out.println("-----------------");

        // 获取文件的最后修改时间（单位：毫秒）
        System.out.println(f1.lastModified());
        long l = f1.lastModified();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // 转换为时间戳
        System.out.println(Instant.ofEpochMilli(l).atZone(ZoneId.systemDefault()).format(formatter));
        System.out.println("-----------------");

        // 获取创建文件对象时，使用的路径
        System.out.println(f1.getPath());
        System.out.println("-----------------");

        // 获取文件的绝对路径
        System.out.println(f1.getAbsolutePath());
        System.out.println("-----------------");
    }
}
