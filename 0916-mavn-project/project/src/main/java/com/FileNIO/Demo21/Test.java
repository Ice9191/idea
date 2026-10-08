package com.FileNIO.Demo21;

import java.io.*;

public class Test {
    /**
     * DataOutputStream：数据输出流
     *  允许把数据和其类型一并写出去
     *  构造方法：
     *      public DataOutputStream(OutputStream out)：创建新数据输出流包装基础的字节输出流
     *  成员方法：
     *      public final void writeByte(int v) throws IOException：将byte类型的数据写入基础的字节输出流
     *      public final void writeInt(int v) throws IOException：将int类型的数据写入基础的字节输出流
     *      public final void writeDouble(Double v) throws IOException：将double类型的数据写入基础的字节输出流
     *      public final void writeUTF(String str) throws IOException：将字符串数据以UTF-8编码成字节写入基础的字节输出流
     *      public void write(int/byte[]/byte[]一部分)：支持写字节数据出去
     *
     * DataInputStream：数据输入流
     *  用于读取数据输出流写出去的数据，因为写入的数据直接看是看不懂的
     *  构造方法：
     *      public DataInputStream(InputStream is)：创建新数据输入流包装基础的字节输入流
     *  成员方法：
     *      public final byte readByte() throws IOException：读取字节数据返回
     *      public final int readInt() throws IOException：读取int类型的数据返回
     *      public final double readDouble() throws IOException：读取double类型的数据返回
     *      public final String readUTF() throws IOException：读取字符串数据（UTF-8）返回
     *      public int readInt()/read(byte[])：支持读字节数据进来
     */
    public static void main(String[] args) {
        test01();
        test02();
    }

    public static void test01(){
        try (
                // 创建一个数据输出流包装成低级的字节输出流
                DataOutputStream dos = new DataOutputStream(new FileOutputStream("0916-mavn-project/project/src/main/java/com/FileNIO/Demo21/aaa.txt"));
                ) {
            dos.writeInt(97);
            dos.writeDouble(99.5);
            dos.writeBoolean(true);
            dos.writeUTF("你好中国");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void test02(){
        try (
                // 创建一个数据输入流包装成低级的字节输入流
                DataInputStream dis = new DataInputStream(new FileInputStream("0916-mavn-project/project/src/main/java/com/FileNIO/Demo21/aaa.txt"));
        ) {
            // 要和前面的write对应
            int i = dis.readInt();
            System.out.println(i);

            double v = dis.readDouble();
            System.out.println(v);

            boolean b = dis.readBoolean();
            System.out.println(b);

            String s = dis.readUTF();
            System.out.println(s);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
