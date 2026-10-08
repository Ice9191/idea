package com.FileNIO.Demo15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class Test {
    /**
     * BufferedReader：字符缓冲输入流
     *  作用：自带8KB（8192）的字符缓冲池，可以提高字符输入流读取字符数据的性能
     *  构造方法：
     *      public BufferedReader(Reader r)：把低级的字符输入流包装成字符缓冲输入流管道，从而提高读取字符数据的性能
     *  字符缓冲输入流新增的功能：按照行读取字符数据
     *      public String readLine()：读取一行数据返回，如果没有数据可读了，返回null
     */

    public static void main(String[] args) {

        test();
    }

    public static void test(){
        try(
                Reader fr = new FileReader("0916-mavn-project/project/src/main/java/com/FileNIO/Demo15/aaa.txt");
                // 创建一个字符缓冲输入流包装原始的字符输入流
                // 这里就不要用多态了，因为要使用BufferedReader新增的功能
                BufferedReader br = new BufferedReader(fr);
        ){
            // char[] buffer = new char[7];
            // int len;
            // while ((len = br.read(buffer)) != -1){
            //     System.out.println(new String(buffer,0,len));
            // }

            // 按照行读取字符数据
            String line; // 记住每次读取的一行数据
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
