package com.FileNIO.Demo13;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Test {
    /**
     * FileReader：文件字符输入流
     *  作用：以内存为基准，可以把文件中的数据以字符的形式读入到内存中去
     *  构造方法：
     *      public FileReader(File file)：创建字符输入流管道与源文件连通
     *      public FileReader(String pathname)：创建字符输入流管道与源文件连通
     *  常用方法：
     *      public int read()：每次读取一个字符返回，如果发现没有数据可读会返回-1
     *      public int read(char[] buffer)：每次用一个字符数组去读取数据，返回字符数组读取了多少个字符，如果发现没有数据可读会返回-1
     */

    public static void main(String[] args) {

        // 1. 创建一个文件字符输入流管道与源文件连通
        try (
                Reader fr = new FileReader("0916-mavn-project/project/src/main/java/com/FileNIO/Demo13/aaa.txt");
                ) {
            // 2. 读取文本文件的内容
            // int c; // 用于记住每次读取的字符编号
            // while ((c = fr.read()) != -1){
            //     System.out.print((char) c);
            // } // 这种方式的性能比较差

            // 3. 每次读取多个字符
            char[] buffer = new char[3];
            int len; // 记住每次读了多少个字符
            while ((len = fr.read(buffer)) != -1){
                // 读取多少就倒出多少
                System.out.print(new String(buffer, 0, len));
            } // 这种方式的性能比较好
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
