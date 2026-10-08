package com.FileNIO.Demo16;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class Test {
    /**
     * BufferedWriter：字符缓冲输出流
     *  作用：自带8KB的字符缓冲池，可以提高字符输出流写入字符数据的性能
     *  构造方法：
     *      public BufferedWriter(Writer r)：把低级的字符输出流包装成一个高级的字符缓冲输出流管道，从而提高写入字符数据的性能
     *  字符缓冲输出流新增的功能：换行
     *      public void newLine()：换行
     */

    public static void main(String[] args) {
        test();
    }

    public static void test(){
        try(
                Writer fw = new FileWriter("0916-mavn-project/project/src/main/java/com/FileNIO/Demo16/aaa.txt",true);
                // 创建一个字符缓冲输出流管道包装原始的字符输出流
                // 也不要用多态，因为要使用BufferedWriter新增的功能
                BufferedWriter bw = new BufferedWriter(fw);
        ){
            bw.write('a');
            bw.write(97);
            bw.write('类');

            // bw.write("\r\n");
            bw.newLine(); // 换行

            bw.write("我爱你中国");

            // bw.write("\r\n");
            bw.newLine();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
