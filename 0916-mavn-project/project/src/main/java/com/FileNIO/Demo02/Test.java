package com.FileNIO.Demo02;

import java.io.File;

public class Test {
    /**
     * 创建File类的对象的构造方法
     *  1. public File(String pathname)：根据文件路径创建文件对象
     *  2. public File(String parent, String child)：根据父路径和子路径名字创建文件对象
     *  3. public File(File parent, String child)：根据父路径对应文件对象和子路径名字创建文件对象
     *
     * 注意：
     *  1. File对象既可以代表文件，也可以代表文件夹
     *  2. File封装的对象仅仅是一个路径名，这个路径可以是存在的，也允许是不存在的
     *
     * 绝对路径：File f5 = new File("/Users/hxb/Desktop/Idea/0916-mavn-project/project/src/main/java/com/FileNIO/Demo02/aaa.txt");
     *
     * 相对路径：File f5 = new File("0916-mavn-project/project/src/main/java/com/FileNIO/Demo02/aaa.txt");
     *  模块名/aaa.txt（默认不带盘符，直接到当前工程下的目录寻找文件）
     */

    public static void main(String[] args) {

        // 1. 创建一个File对象，指代某个具体的文件，交给File类型的变量f1记录
        File f1 = new File("/Users/hxb/Downloads/aa.txt");
        System.out.println(f1.length() + "字节");
        // 兼容不同操作系统的路径分隔符问题
        File f2 = new File("/Users/hxb"+File.separator+"Downloads"+File.separator+"aa.txt");
        System.out.println(f2.length() + "字节");
        File f3 = new File("/Users/hxb/Downloads"); // 记录的是文件夹里面的文件信息，而不是文件夹的大小
        System.out.println(f3.length() + "字节");
        // 注意：File对象可以指代一个不存在的文件路径（后面可以用方法创建出来）
        File f4 = new File("/Users/hxb/Downloads/aaaa.txt");
        System.out.println(f4.length() + "字节");
        System.out.println(f4.exists()); // false
        // 如何定位模块中文件的路径
        // 绝对路径
        // File f5 = new File("/Users/hxb/Desktop/Idea/0916-mavn-project/project/src/main/java/com/FileNIO/Demo02/aaa.txt");
        // 相对路径
        File f5 = new File("0916-mavn-project/project/src/main/java/com/FileNIO/Demo02/aaa.txt");
        System.out.println(f5.length() + "字节");
    }
}
