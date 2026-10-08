package com.FileNIO.Demo12;

import java.io.*;

public class Test {
    /**
     * jdk7开始提供了更简单的资源释放方案：try-with-resources
     *  try(定义资源1;定义资源2;...){
     *      可能会出异常的代码;
     *  }catch(异常类名 变量名){
     *      异常的处理代码;
     *  }
     *  该资源使用完毕后，会自动调用其close()方法，完成对资源的释放
     *
     * 注意：
     *  1. ()中只能放置资源对象（比如流对象）
     *  2. 什么是资源？
     *      资源对象必须实现AutoCloseable接口
     *      资源对象都会有一个close()方法，并且资源对象放到()用完之后，会被自动调用其close()方法完成资源的释放操作
     */

    public static void main(String[] args) throws IOException {

        copyImage();
    }

    public static void copyImage() throws IOException {

        try (
                // 需求复制图片
                // 创建一个字节输入流管道与源文件连通
                InputStream is = new FileInputStream("/Users/hxb/Downloads/IMG_0299.PNG");
                // 创建一个字节输出流管道与目标文件连通
                OutputStream os = new FileOutputStream("/Users/hxb/Desktop/IMG_0299.PNG");
                ) {
            // 创建一个字节数组，负责转移字节数据
            byte[] buffer = is.readAllBytes();

            // 从字节输入流中读取字节数据，写出去到字节输出流中，读多少，就倒多少
            os.write(buffer, 0, buffer.length);

            System.out.println("复制图片成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
