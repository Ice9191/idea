package com.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Demo08 {
    /**
     * DateTimeFormatter类常见方法：
     *  1. public static DateTimeFormatter ofPattern(时间格式)：获取格式化器对象
     *  2. public String format(时间对象)：格式化时间
     *
     * LocalDateTime提供的格式化、解析时间的方法：
     *  1. public String format(DateTimeFormatter formatter)：格式化时间
     *  2. public static LocalDateTime parse(CharSequence text, DateTimeFormatter formatter)：解析时间
     */

    public static void main(String[] args) {

        // 创建一个日期时间格式化器对象出来
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // 对时间进行格式化
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        String ftt = dtf.format(now); // 正向格式化时间
        System.out.println(ftt);

        // 格式化时间，其实还有一种方案
        String s = now.format(dtf); // 反向格式化时间
        System.out.println(s);

        // 解析时间，一般使用LocalDateTime类的parse方法
        String str = "2077-01-01 12:11:11";
        LocalDateTime parse = LocalDateTime.parse(str, dtf);
        System.out.println(parse);
    }
}
