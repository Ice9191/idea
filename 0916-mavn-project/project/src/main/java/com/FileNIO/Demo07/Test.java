package com.FileNIO.Demo07;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
    /**
     * 标准ASCII字符集：标准ASCII使用1个字节存储一个字符，首位是0，总共可表示128个字符
     *
     * GBK（汉字内码扩展规范，国标）：汉字编码字符集，汉字的第一个字节的第一位必须是1，一个中文字符编码成两个字节的形式存储
     *  注意：GBK兼容了ASCII字符集
     *
     * Unicode字符集（统一码，也叫万国码）：是国际组织制定的，可以容纳世界上所有文字、符号的字符集
     * UTF-8：Unicode字符集的一种编码方案，采取可变长编码方案，共分四个长度区：1个字节、2个字节、3个字节、4个字节
     *  英文字符、数字等只占1个字节（兼容标准ASCII编码），汉字字符占用3个字节
     *  注意：技术人员在开发时都应该使用UTF-8编码
     *
     * 注意1：字符编码时使用的字符集，和解码时使用的字符集必须一致，否则会导致乱码
     * 注意2：英文和数字一般不会乱码，但是中文字符会乱码，因为很多字符集都兼容了ASCII编码
     *
     * java代码完成对字符的编码（将字符串转换为字节数组）
     *  1. byte[] getBytes()：使用平台的默认字符集（UTF-8）将该String编码为一系列字节，将结果存储到新的字节数组中
     *  2. byte[] getBytes(String charsetName)：使用指定的字符集将该String编码为一系列字节，将结果存储到新的字节数组中
     * java代码完成对字符的解码（将字节数组转换为字符串）
     *  1. String(byte[] bytes)：通过使用平台的默认字符集（UTF-8）解码指定的字节数组来构造新的String对象
     *  2. String(byte[] bytes, String charsetName)：通过使用指定的字符集解码指定的字节数组来构造新的String对象
     */

    public static void main(String[] args) throws UnsupportedEncodingException {

        // 字符编码
        String data = "a我b";
        byte[] bytes = data.getBytes(); // UTF-8编码
        System.out.println(Arrays.toString(bytes)); // 1开头为负数，0开头为正数

        System.out.println("-----------------");

        // 指定字符集编码
        byte[] bytesGBK = data.getBytes("GBK");
        System.out.println(Arrays.toString(bytesGBK));

        System.out.println("-----------------");

        // 字符解码
        String s = new String(bytes);
        System.out.println(s);

        System.out.println("-----------------");

        // 指定字符集解码
        String sGBK = new String(bytesGBK, "GBK");
        System.out.println(sGBK);
    }
}
