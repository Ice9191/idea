package com.FileNIO.Demo04;

import java.io.File;
import java.io.IOException;

public class Test {
    /**
     * File创建和删除文件相关的方法
     *  1. public boolean createNewFile()：创建一个新的空文件，创建成功返回true，失败返回false
     *  2. public boolean mkdir()：创建一个新的空目录，只能创建一级目录
     *  3. public boolean mkdirs()：创建一个新的空目录，可以创建多级目录
     *  4. public boolean delete()：删除文件或目录，不能删除非空目录，只能删除空目录
     */

    public static void main(String[] args) throws IOException {

        // 创建一个空文件
        File file1 = new File("/Users/hxb/Downloads/bb.txt");
        System.out.println(file1.createNewFile());

        // 创建一个一级空目录
        File file2 = new File("/Users/hxb/Downloads/cc");
        System.out.println(file2.mkdir());

        // 创建一个多级空目录
        File file3 = new File("/Users/hxb/Downloads/cc/dd/ff");
        // System.out.println(file3.mkdirs());

        // 删除一个空目录
        System.out.println(file1.delete());
    }
}
