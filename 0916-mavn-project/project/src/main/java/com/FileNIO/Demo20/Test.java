package com.FileNIO.Demo20;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Test {
    /**
     * 打印流的一种应用：输出语句的重定向
     *  可以把输出语句的打印位置改到某个文件中去
     */
    public static void main(String[] args) {
        try (
                // out其实是PrintStream对象
                PrintStream ps = new PrintStream("0916-mavn-project/project/src/main/java/com/FileNIO/Demo20/aaa.txt");
                ) {
            // 把系统默认的打印流对象改成自己设置的打印流
            System.setOut(ps);
            System.out.println("老骥伏枥");
            System.out.println("志在千里");
            System.out.println("烈士暮年");
            System.out.println("壮心不已");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
