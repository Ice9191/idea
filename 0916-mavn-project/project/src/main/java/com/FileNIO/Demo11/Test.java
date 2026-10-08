package com.FileNIO.Demo11;

import java.io.*;

public class Test {
    /**
     * try-catch-finally：一般用于在程序执行完成后进行资源的释放操作
     */

    public static void main(String[] args) throws IOException {

        copyImage();
    }

    public static void copyImage() throws IOException {
        InputStream is = null;
        OutputStream os = null;

        try {
            // 需求复制图片
            // 创建一个字节输入流管道与源文件连通
            is = new FileInputStream("/Users/hxb/Downloads/IMG_0299.PNG");
            // 创建一个字节输出流管道与目标文件连通
            os = new FileOutputStream("/Users/hxb/Desktop/IMG_0299.PNG");

            // 创建一个字节数组，负责转移字节数据
            byte[] buffer = is.readAllBytes();

            // 从字节输入流中读取字节数据，写出去到字节输出流中，读多少，就倒多少
            os.write(buffer, 0, buffer.length);

            System.out.println("复制图片成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // 先关闭后创建的流，后关闭先创建的流
            try {
                if(os != null) os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(is != null) is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
