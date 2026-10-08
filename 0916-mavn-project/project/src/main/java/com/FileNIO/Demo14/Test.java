package com.FileNIO.Demo14;

import com.sun.source.tree.TryTree;

import java.io.*;

public class Test {
    /**
     * 缓冲流的作用：用来包装原始流，然后提高原始流读写的性能
     *  原始流/低级流：FileInputStream、FileOutputStream、FileReader、FileWriter
     *  包装流/处理流：BufferedInputStream、BufferedOutputStream、BufferedReader、BufferedWriter
     *
     * 字节缓冲流的作用：提高字节流读写数据的性能
     * 传统文件复制：
     *  D盘：数据源16KB ---字节输入流---> 内存：字节数组1KB ----字节输出流---> C盘：目的地
     *      问题：源文件16KB，而字节数组是1KB，总共要读16次，进行16次系统调用，也需要写16次，也就是总共需要进行32次系统调用才可以完成复制，性能较差
     * 加入字节缓冲流之后：
     *  D盘：数据源16KB ---> 将字节输入流包装成字节输入缓冲流，就会在内存中开辟一个8KB的缓冲池，并进行读取 ---> 内存：字节数组会从8KB的缓冲池中读取数据，并写入到8KB的字节输出缓冲流的缓冲池中 ---> 字节输出缓冲流也会对字节输出流进行包装，在内存中开辟一个8KB的缓冲池 ---> C盘：目的地
     *      原理：字节缓冲流输入流自带了8KB的缓冲池；字节缓冲流输出流也自带了8KB的缓冲池
     * 构造方法：
     *  public BufferedInputStream(InputStream is)：把低级的字节输入流包装成高级的缓冲字节输入流，从而提高读取数据的性能
     *  public BufferedOutputStream(OutputStream os)：把低级的字节输出流包装成高级的缓冲字节输出流，从而提高写入数据的性能
     */

    public static void main(String[] args) {

        test();
    }

    public static void test(){
        try (
                InputStream is = new FileInputStream("0916-mavn-project/project/src/main/java/com/FileNIO/Demo14/aaa.txt");
                // 1. 定义一个字节缓冲输入流包装成原始的字节输入流
                // 加入size参数，指定缓冲池的大小
                InputStream bis = new BufferedInputStream(is,8192 * 2);

                OutputStream os = new FileOutputStream("0916-mavn-project/project/src/main/java/com/FileNIO/Demo14/bbb.txt");
                // 2. 定义一个字节缓冲输出流包装成原始的字节输出流
                OutputStream bos = new BufferedOutputStream(os, 8192 * 2);
                ) {
            byte[] buffer = bis.readAllBytes();
            bos.write(buffer,0,buffer.length);
            System.out.println("复制完成");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
