package com.FileNIO.Demo09;

import java.io.*;

public class Test {
    /**
     * FileOutputStream：文件字节输出流
     *  作用：以内存为基准，把内存中的数据以字节的形式写出到文件中去
     *
     * FileOutputStream的构造方法：
     *  public FileOutputStream(File file)：创建字节输出流管道与源文件对象连通
     *  public FileOutputStream(String filePath)：创建字节输出流管道与源文件路径连通
     *  public FileOutputStream(File file, boolean append)：创建字节输出流管道与源文件对象连通，可追加数据
     *  public FileOutputStream(String filePath, boolean append)：创建字节输出流管道与源文件路径连通，可追加数据
     *
     * FileOutputStream的成员方法：
     *  public void write(int a)：写一个字节出去
     *  public void write(byte[] buffer)：写一个字节数组出去
     *  public void write(byte[] buffer, int pos, int len)：写一个字节数组的一部分出去
     *  public void close() throws IOException：关闭流
     */

    public static void main(String[] args) throws IOException {

        test1();
    }

    public static void test1() throws IOException {
        // 创建一个字节输出流管道与目标文件连通
        // 覆盖管道，会覆盖目标文件中的数据，无法追加
        // OutputStream os = new FileOutputStream("0916-mavn-project/project/src/main/java/com/FileNIO/Demo09/aaa.txt");
        // 追加管道，不会覆盖目标文件中的数据，可以追加数据
        OutputStream os = new FileOutputStream("0916-mavn-project/project/src/main/java/com/FileNIO/Demo09/aaa.txt", true);

        // 开始写数据出去
        os.write(97);
        os.write('a');
        // os.write('中'); // 只能写一个字节，所以写不进去

        // 写入一个字节数组
        // 解码
        byte[] bytes = "我爱你中国".getBytes();
        os.write(bytes);

        // 写入一个字节数组的一部分
        byte[] bPart = "你好abc".getBytes();
        os.write(bPart, 0, 7);

        // 换行
        // 换行符：\r\n
        os.write("\r\n".getBytes());

        // 关闭流
        os.close();
    }
}
