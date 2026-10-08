package com.time;

import java.io.Serializable;
import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo02 {
    /**
     * SimpleDateFormat类：日期格式化类，可以用来把日期对象、时间毫秒值格式化成我们想要的形式
     *  构造方法：
     *      1. public SimpleDateFormat(String pattern)：创建简单日期格式化对象，并封装时间的格式
     *  方法：
     *      1. public final String format(Date date)：将日期格式化成日期/时间字符串
     *      2. public final String format(Object time)：将时间毫秒值格式化成日期/时间字符串
     *
     * SimpleDateFormat类解析字符串时间成为日期对象
     *  方法：
     *      1. public Date parse(String source)：将字符串时间解析成日期对象
     */

    public static void main(String[] args) {

        // 准备一些时间
        Date d = new Date();
        System.out.println(d);
        long l = d.getTime();
        System.out.println(l);

        // 格式化日期对象和时间毫秒值
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE a");
        Serializable f1 = sdf.format(d);
        System.out.println(f1);
        String f2 = sdf.format(l);
        System.out.println(f2);

        System.out.println("-----------------");

        // 解析字符串时间成为日期对象
        String str = "2023-09-16 10:12:11";
        // 1. 创建SimpleDateFormat对象，指定的时间格式必须与被解析的时间字符串格式一致
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse;
        try {
            // parse方法会觉得str和sdf1的时间格式不一致，会抛出ParseException异常
            parse = sdf1.parse(str);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println(parse);
    }
}
