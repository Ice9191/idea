package com.FileNIO.Demo18;

import java.io.*;

public class Test {
    /**
     * 不同编码读取出现乱码的问题：
     *  如果代码编码和被读取的文本文件的编码是一致的，使用字符流读取文本文件时不会出现乱码
     *  如果代码编码和被读取的文本文件的编码是不一致的，使用字符流读取文本文件时会出现乱码
     *
     * InputStreamReader：字符输入转换流
     *  解决不同编码时，字符流读取文本内容乱码的问题
     *  解决思路：先获取文件的原始字节流，再将其按真实的字符集编码转成字符输入流，这样字符输入流中的字符就不乱码了
     *  构造方法：
     *      public InputStreamReader(InputStream is)：把原始的字节输入流，按照代码默认编码转成字符输入流（与直接用FileReader的效果一样）
     *      public InputStreamReader(InputStream is, String charset)：把原始的字节输入流，按照指定的字符集编码转成字符输入流（重点）
     *
     * OutputStreamWriter：字符输出转换流
     *  作用：可以控制写出去的字符使用什么字符集编码
     *  解决思路：获取字节输出流，再按照指定的字符集编码将其转换成字符输出流，以后写出去的字符就会用该字符集编码了
     *  构造方法：
     *      public OutputStreamWriter(OutputStream os)：可以把原始的字节输出流，按照代码默认编码转换成字符输出流
     *      public OutputStreamWriter(OutputStream os, String charset)：可以把原始的字节输出流，按照指定的字符集编码转成字符输出流（重点）
     */
    public static void main(String[] args) {

        // test01();
        // test02();
        test03();

    }

    public static void test01(){
        try (
                // 创建一个文件字符输入流与源文件连通
                // 代码编码：UTF-8  文件编码：UTF-8
                // Reader fr = new FileReader("0916-mavn-project/project/src/main/java/com/FileNIO/Demo18/aaa.txt");
                // 代码编码：UTF-8  文件编码：GBK 用UTF-8读取GBK的文件会出现乱码
                Reader fr = new FileReader("0916-mavn-project/project/src/main/java/com/FileNIO/Demo18/bbb.txt");
                // 把文件字符输入流包装成缓冲字符输入流
                BufferedReader br = new BufferedReader(fr);
                ) {
            // 按照一行一行的去读
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void test02(){
        try (
                // 得到文件的原始字节流（GBK的字节流形式）
                InputStream fis = new FileInputStream("0916-mavn-project/project/src/main/java/com/FileNIO/Demo18/bbb.txt");
                // 把原始的字节输入流按照指定的字符集编码转换成字符输入流
                Reader isr = new InputStreamReader(fis, "GBK");
                // 把字符输入流包装成缓冲字符输入流
                BufferedReader br = new BufferedReader(isr);
                ) {
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void test03(){
        try (
                // 指定写出去的字符编码
                // 创建一个文件字节输出流
                OutputStream os = new FileOutputStream("0916-mavn-project/project/src/main/java/com/FileNIO/Demo18/ccc.txt");
                // 把原始的字节输出流，按照指定的字符集编码转换成字符输出转换流
                Writer osw = new OutputStreamWriter(os, "GBK");
                // 把字符输出流包装成缓冲字符输出流
                BufferedWriter bw = new BufferedWriter(osw);
                ) {
            bw.write("我是中国人abc"); // 写出去字符流向bw，然后根据GBK编码写到os，最后流向ccc.txt
            bw.write("我爱你中国123");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
