package com.FileNIO.Demo08;

import java.io.*;

public class A {
    /**
     * FileInputStream：文件字节输入流
     *  作用：以内存为基准，可以把磁盘文件中的数据以字节的形式读入到内存中去
     *
     * FileInputStream的构造方法
     *  public FileInputStream(File file)：创建字节输入流管道与源文件连通（就是创建对象）
     *  public FileInputStream(String fileName)：创建字节输入流管道与源文件连通
     * FileInputStream的方法
     *  public int read()：每次读取一个字节返回，如果发现没有数据可读就返回-1
     *  public int read(byte[] buffer)：每次用一个字节数组去读取数据，返回字节数组读取了多少个字节，如果发现没有数据可读就返回-1
     *
     * read()的问题：
     *  1. 读取数据的性能很差
     *  2. 读取汉字输出会乱码，无法避免（因为在UTF-8，一个汉字占3个字节，而read每次只能读一个字节）
     *
     * 注意：流使用完毕之后，必须关闭，释放系统资源
     */

    public static void main(String[] args) throws IOException {

        // 创建文件字节输入流管道与源文件连通
        // 会用多态的方式来写，就是父类类型改为InputStream
        // InputStream fis = new FileInputStream(new File("0916-mavn-project/project/src/main/java/com/FileNIO/Demo08/aaa.txt"));
        // 简化写法，推荐使用
        InputStream fis = new FileInputStream("0916-mavn-project/project/src/main/java/com/FileNIO/Demo08/aaa.txt");

        // 开始读取文件的字节数据
        /*int i1 = fis.read();
        System.out.println(i1); // a -- 97
        int i2 = fis.read();
        System.out.println(i2);
        int i3 = fis.read();
        System.out.println(i3);
        int i4 = fis.read(); // 已读完，返回-1
        System.out.println(i4);*/

        // 使用循环改造上述代码
        int flag; // 用于记住读取的字节
        while ((flag = fis.read()) != -1){
            System.out.print((char) flag);
        }

        System.out.println();
        System.out.println("----------------");

        // test();
        testSt();

        // 关闭流
        fis.close();
    }

    public static void test() throws IOException {

        // 创建一个字节输入流对象代表字节输入流管道与源文件连通
        InputStream fis = new FileInputStream("0916-mavn-project/project/src/main/java/com/FileNIO/Demo08/bbb.txt");

        // 开始读取文件中的字节数据：每次读取多个字节
        byte[] buffer = new byte[3];
        int len = fis.read(buffer);
        // 解码
        String str = new String(buffer);
        System.out.println("当此读取的字节量" + len);
        System.out.println(str);
        // 第一次读：buffer = [bba]
        // 替换
        // 第二次读：buffer = [66a]

        System.out.println("-------------------");

        int lenEn = fis.read(buffer);
        // 注意：读取多少就要倒出多少，不然就会导致66a的效果，多倒问题
        // 使用String的重载方法，从0开始到lenen的字节倒出来
        String strTr = new String(buffer, 0, lenEn);
        System.out.println("当此读取的字节量" + lenEn);
        System.out.println(strTr);

        System.out.println("-------------------");

        int lenEnEn = fis.read(buffer);
        System.out.println(lenEnEn); // -1

        fis.close();
    }

    // 使用循环改造test
    /**
     * 性能得到了提升
     * 但是也不能避免汉字乱码的问题
     */
    public static void testSt() throws IOException {

        InputStream fis = new FileInputStream("0916-mavn-project/project/src/main/java/com/FileNIO/Demo08/ccc.txt");

        byte[] buffer = new byte[3];
        int len; // 记住每次读取了多少个字节
        while ((len = fis.read(buffer)) != -1){
            // 注意：读取多少，倒出多少
            String str = new String(buffer, 0, len);
            System.out.print(str);
        }

        fis.close(); // 关闭流
    }
}
