package com.FileNIO.Demo13;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class A {
    /**
     * FileWriter：文件字符输出流
     *  作用：以内存为基准，把内存中的数据以字符的形式写出到文件中去
     *  构造方法：
     *      public FileWriter(File file)：创建字符输出流管道与源文件对象连通
     *      public FileWriter(String filepath)：创建字符输出流管道与源文件路径连通
     *      public FileWriter(File file, boolean append)：创建字符输出流管道与源文件对象连通，append为true时，表示可追加数据
     *      public FileWriter(String filepath, boolean append)：创建字符输出流管道与源文件路径连通，append为true时，表示可追加数据
     *  常用方法：
     *      void write(int c)：写一个字符
     *      void write(String str)：写一个字符串
     *      void write(String str, int off, int len)：写一个字符串的一部分
     *      void write(char[] cbuf)：写入一个字符数组
     *      void write(char[] cbuf, int off, int len)：写入字符数组的一部分
     */

    public static void main(String[] args) {
        test();
    }

    public static void test(){
        try (
                // 1. 创建一个文件字符输出流管道与源文件连通
                // 这是一个覆盖管道
                // Writer fw = new FileWriter("0916-mavn-project/project/src/main/java/com/FileNIO/Demo13/bbb.txt");
                // 这是一个追加管道
                Writer fw = new FileWriter("0916-mavn-project/project/src/main/java/com/FileNIO/Demo13/bbb.txt",true);
                ) {
            // 2. 写一个字符出去
            fw.write('a');
            fw.write(91);
            fw.write('展');
            fw.write("\r\n"); // 换行

            // 3. 写一个字符串出去
            fw.write("我爱你中国abc");
            fw.write("\r\n");

            // 4. 写字符串的一部分出去
            fw.write("我爱你中国abc",0,5);
            fw.write("\r\n");

            // 5. 写一个字符数组出去
            char[] buffer = {'黄','新','并','6','6','a','b','c'};
            fw.write(buffer);
            fw.write("\r\n");

            // 6. 写字符数组的一部分出去
            fw.write(buffer,0,3);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
