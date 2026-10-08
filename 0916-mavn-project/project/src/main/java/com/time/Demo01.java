package com.time;

import java.util.Date;

public class Demo01 {
    /**
     * Date类：代表的是日期和时间
     *  1. 构造方法：
     *      public Date()：创建一个Date对象，代表的是系统当前此刻日期时间
     *      public Date(long time)：把时间毫秒值转换成Date日期对象
     *  2. 常见成员方法：
     *      public long getTime()：返回从1970年1月1日0时0分0秒到当前日期时间的总毫秒数
     *      public void setTime(long time)：设置日期对象的时间为当前时间毫秒值对应的时间
     */

    public static void main(String[] args) {

        // 创建一个Date对象，代表的是系统当前此刻日期时间
        Date date = new Date();
        System.out.println(date);

        // 拿到时间毫秒值
        long time = date.getTime();
        System.out.println(time);

        // 把时间毫秒值转换成Date日期对象：2s之后的时间是多少
        time += 2000;
        Date date1 = new Date(time);
        System.out.println(date1);

        // 直接把日期对象的时间通过setTime方法进行修改
        Date date2 = new Date();
        date2.setTime(time);
        System.out.println(date2);
    }
}
