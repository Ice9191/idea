package com.FileNIO.Demo23;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Test {
    /**
     * 什么是框架？
     *  解决某类问题，编写的一套类、接口等，可以理解成一个半成品，大多框架都是第三方研发的
     *  好处：在框架的基础上开发，可以得到优秀的软件架构，并能提高开发效率
     *  框架的形式：一般是把类、接口等编译成class形式，再压缩成一个.jar结尾的文件发行出去
     *
     * 什么是IO框架？
     *  封装了java提供的对文件、数据进行操作的代码，对外提供了更简单的方式来对文件进行操作，对数据进行读写等
     *
     * Commons-iO：Commons-io是apache开源基金组织提供的一组有关IO操作的小框架，目的是提高IO流的开发效率
     *  FileUtils：（Commons-io提供的）文件工具类
     *      静态方法：
     *          public static void copyFile(File srcFile, File destFile)：复制文件
     *          public static void copyDirectory(File srcDir, File destDir)：复制文件夹
     *          public static void deleteDirectory(File directory)：删除文件夹
     *          public static String readFileToString(File file, String encoding)：读数据
     *          public static void writeStringToFile(File file, String data, String charName, boolean append)：写数据
     *  IOUtils：（Commons-io提供的）IO工具类
     *      静态方法：
     *          public static int copy(InputStream inputStream, OutputStream outputStream)：复制文件
     *          public static int copy(Reader reader, Writer writer)：复制文件
     *          public static void write(String data, OutputStream output, String charsetName)：写数据
     */
    public static void main(String[] args) throws IOException {
        // test01();
        test02();
    }

    public static void test01() throws IOException {
        FileUtils.copyFile(new File("0916-mavn-project/project/src/main/java/com/FileNIO/Demo23/aaa.txt"), new File("0916-mavn-project/project/src/main/java/com/FileNIO/Demo23/bbb.txt"));
        FileUtils.copyDirectory(new File("/Users/hxb/Desktop/important"), new File("/Users/hxb/Downloads/1"));
        FileUtils.deleteDirectory(new File("/Users/hxb/Downloads/1"));
    }

    public static void test02() throws IOException {
        // java提供的原生的一行代码搞定很多事情（并没有apache.commons.io方便）
        Files.copy(Path.of("0916-mavn-project/project/src/main/java/com/FileNIO/Demo23/aaa.txt"), Path.of("0916-mavn-project/project/src/main/java/com/FileNIO/Demo23/ccc.txt"));
        String str = Files.readString(Path.of("0916-mavn-project/project/src/main/java/com/FileNIO/Demo23/aaa.txt"));
        System.out.println(str);
    }
}
