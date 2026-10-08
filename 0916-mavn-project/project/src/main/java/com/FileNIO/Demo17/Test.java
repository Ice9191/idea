package com.FileNIO.Demo17;

import java.io.*;

public class Test {
    /**
     * 原始流、缓冲流的性能分析
     *  测试用例：分别使用原始的字节流，以及字节缓冲流复制一个很大的视频
     *  测试步骤：
     *      1. 使用低级的字节流按照一个一个字节的形式复制文件
     *      2. 使用低级的字节流按照字节数组的形式复制文件
     *      3. 使用高级的缓冲字节流按照一个一个字节的形式复制文件
     *      4. 使用高级的缓冲字节流按照字节数组的形式复制文件
     */
    private static final String SRC_FILE = "/Users/hxb/.zzz/happy/zombie.mp4";
    private static final String DEST_FILE = "/Users/hxb/Downloads/";

    public static void main(String[] args) {

        // copyByByte(); // 低级的字节流一个一个字节的复制，慢的简直让人无法忍受，直接淘汰
        copyByBytes(); // 低级的字节流按照字节数组的形式复制，速度较快，推荐使用
        // copyByBufferedByte(); // 缓冲流按照一个一个字节的形式复制，速度较慢，直接淘汰
        copyByBufferedBytes(); // 缓冲流按照字节数组的形式复制，速度极快，推荐使用

    }

    public static void copyByByte() {
        long start = System.currentTimeMillis();
        try(
                InputStream is = new FileInputStream(SRC_FILE);
                OutputStream os = new FileOutputStream(DEST_FILE + "1.mp4");
        ){
            // 按照一个一个字节的形式复制视频
            int b;
            while ((b = is.read()) != -1){
                os.write(b);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("低级字节流一个一个字节复制耗时：" + (end - start) / 1000.0 + "s");
    }

    public static void copyByBytes() {
        long start = System.currentTimeMillis();
        try(
                InputStream is = new FileInputStream(SRC_FILE);
                OutputStream os = new FileOutputStream(DEST_FILE + "2.mp4");
        ){
            // 按照字节数组的形式复制视频
            byte[] buffer = new byte[1024 * 64]; // 1KB 改为 8KB 改为 32KB 改为 64KB ； 1.499s 变为 0.456s 变为 0.455s 变为 0.357s
            int len;
            while ((len = is.read(buffer)) != -1){
                os.write(buffer, 0, len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("低级字节流使用字节数组复制耗时：" + (end - start) / 1000.0 + "s");
    }

    public static void copyByBufferedByte() {
        long start = System.currentTimeMillis();
        try(
                InputStream is = new FileInputStream(SRC_FILE);
                BufferedInputStream bis = new BufferedInputStream(is);
                OutputStream os = new FileOutputStream(DEST_FILE + "3.mp4");
                BufferedOutputStream bos = new BufferedOutputStream(os);
        ){
            // 使用高级的缓冲字节流按照一个一个字节的形式复制视频
            int b;
            while ((b = bis.read()) != -1){
                bos.write(b);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("高级的缓冲字节流一个一个字节复制耗时：" + (end - start) / 1000.0 + "s");
    }

    public static void copyByBufferedBytes() {
        long start = System.currentTimeMillis();
        try(
                InputStream is = new FileInputStream(SRC_FILE);
                BufferedInputStream bis = new BufferedInputStream(is, 1024 * 64); // 将缓冲池的大小设置成64KB
                OutputStream os = new FileOutputStream(DEST_FILE + "4.mp4");
                BufferedOutputStream bos = new BufferedOutputStream(os, 1024 * 64);
        ){
            // 使用高级的缓冲字节流按照字节数组的形式复制视频
            byte[] buffer = new byte[1024 * 64]; // 1KB 改为 8KB 改为 32KB 改为64KB ； 0.532s 变为 0.372s 变为 0.291s 变为 0.286s
            int len;
            while ((len = bis.read(buffer)) != -1){
                bos.write(buffer, 0, len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("高级的缓冲字节流使用字节数组复制耗时：" + (end - start) / 1000.0 + "s");
    }

}
