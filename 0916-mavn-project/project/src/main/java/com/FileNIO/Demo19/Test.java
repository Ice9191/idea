package com.FileNIO.Demo19;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.Charset;

public class Test {
    /**
     * PrintStream/PrintWriter：打印流
     *  作用：打印流可以实现更方便、更高效的打印数据出去，能实现打印啥出去就是啥出去（比如打印97，打印的就是97，不是ASCII码）
     *
     * PrintStream
     *  构造方法：
     *      public PrintStream(OutputStream/File/String)：打印流直接通向字节输出流/文件/文件路径
     *      public PrintStream(String fileName, Charset charset)：可以指定写出去的字符编码
     *      public PrintStream(OutputStream out, boolean autoFlush)：可以指定实现自动刷新
     *      public PrintStream(OutputStream out, boolean autoFlush, String encoding)：可以指定实现自动刷新，并可以指定字符的编码
     *  成员方法：
     *      public void println(Xxx xx)：打印任意类型的数据出去（ln为换行）
     *      public void write(int/byte[]/byte[]一部分)：可以支持写字节数据出去
     *
     * PrintWriter
     *  构造方法：
     *      public PrintWriter(OutputStream/Writer/File/String)：打印流直接通向字节输出流/文件/文件路径
     *      public PrintWriter(String fileName, Charset charset)：可以指定写出去的字符编码
     *      public PrintWriter(OutputStream out/Writer, boolean autoFlush)：可以指定实现自动刷新
     *      public PrintWriter(OutputStream out/Writer, boolean autoFlush, String encoding)：可以指定实现自动刷新，并可以指定字符的编码
     *  成员方法：
     *      public void println(Xxx xx)：打印任意类型的数据出去（ln为换行）
     *      public void write(int/String/char[]/...)：可以支持写字节数据出去
     *
     * PrintStream和PrintWriter的区别
     *  打印数据的功能上是一模一样的：都是使用方便，性能高效（核心优势）
     *  PrintStream继承自字节输出流OutputStream，因此支持写字节数据的方法
     *  PrintWriter继承自字符输出流Writer，因此支持写字符数据出去
     */
    public static void main(String[] args) {
        // test01();
        // test02();
        // test03();
        // test04();
        test05();
    }

    public static void test01(){
        try (
                // 创建一个打印流管道（不要用多态了，因为要使用PrintStream特有的方法）
                PrintStream ps = new PrintStream("0916-mavn-project/project/src/main/java/com/FileNIO/Demo19/aaa.txt");
                ) {
            ps.println(97);
            ps.println('a');
            ps.println("我爱你中国");
            ps.println(true);
            ps.println(99.5);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void test02(){
        try (
                // 创建一个打印流管道（不要用多态了，因为要使用PrintStream特有的方法）
                // 以GBK编码写入数据
                PrintStream ps = new PrintStream("0916-mavn-project/project/src/main/java/com/FileNIO/Demo19/aaa.txt", Charset.forName("GBK"));
        ) {
            ps.println(97);
            ps.println('a');
            ps.println("我爱你中国");
            ps.println(true);
            ps.println(99.5);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void test03(){
        try (
                // 创建一个打印流管道（不要用多态了，因为要使用PrintStream特有的方法）
                // 以GBK编码写入数据
                PrintStream ps = new PrintStream("0916-mavn-project/project/src/main/java/com/FileNIO/Demo19/aaa.txt");
        ) {
            ps.println(97);
            ps.println('a');
            ps.println("我爱你中国");
            ps.println(true);
            ps.println(99.5);

            ps.write(97); // 'a'
            // PrintStream无法写字符串
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void test04(){
        try (
                // 创建一个打印流管道（不要用多态了，因为要使用PrintStream特有的方法）
                // 以GBK编码写入数据
                PrintWriter ps = new PrintWriter("0916-mavn-project/project/src/main/java/com/FileNIO/Demo19/aaa.txt");
        ) {
            ps.println(97);
            ps.println('a');
            ps.println("我爱你中国");
            ps.println(true);
            ps.println(99.5);

            ps.write(97); // 'a'
            // PrintWriter可以写字符串
            ps.write("我爱你中国abc");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void test05(){
        try (
                // 创建一个打印流管道（不要用多态了，因为要使用PrintStream特有的方法）
                // 以GBK编码写入数据
                // 高级流无法追加数据，需要包装成低级流
                PrintWriter ps = new PrintWriter(new FileOutputStream("0916-mavn-project/project/src/main/java/com/FileNIO/Demo19/aaa.txt", true));
        ) {
            ps.println(97);
            ps.println('a');
            ps.println("我爱你中国");
            ps.println(true);
            ps.println(99.5);

            ps.write(97); // 'a'
            // PrintWriter可以写字符串
            ps.write("我爱你中国abc");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
