package com.FileNIO.Demo13;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class B {
    /**
     * 字符输出流使用时的注意事项：
     *  字符输出流写出数据后，必须刷新流，或者关闭流，写出去的数据才能生效
     *  因为：字符输出流写数据的时候，并不是直接写到文件中，而是先写到一个缓冲区中，只有当缓冲区满或者刷新流或者关闭流的时候，才会把缓冲区中的数据写到文件中
     *  public void flush() throws IOException：刷新流，就是将内存中缓存的数据立即写到文件中去生效
     *  public void close() throws IOException：关闭流，关闭流包含刷新流的操作
     *
     * 字节流、字符流的使用场景
     *  字节流适合做一切文件数据的拷贝（音频、视频、文本）；字节流不适合读取中文内容输出
     *  字符流适合做文本文件的操作（读、写）
     */

    public static void main(String[] args) throws IOException {
        test();
    }

    public static void test() throws IOException {
        Writer fw = new FileWriter("0916-mavn-project/project/src/main/java/com/FileNIO/Demo13/ccc.txt");

        // 写字符数据出去
        fw.write('a');
        fw.write('b');
        fw.write('c');
        fw.write('d');
        fw.write("\r\n");

        fw.write("我爱你中国");
        fw.write("\r\n");
        fw.write("我爱你中国");

        // 刷新流（防止缓存区中的数据不写出去）
        // fw.flush();
        // fw.write("张三");
        // fw.flush();

        // 关闭流，关闭流包含刷新流的操作
        fw.close();
        // fw.write("张三"); // 关闭流后，不能再写入数据了
    }
}
