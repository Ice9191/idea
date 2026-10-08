package com.time;

import java.util.Calendar;
import java.util.Date;

public class Demo03 {
    /**
     * Calendar类：代表的是系统此刻时间对应的日历，通过它可以单独获取、修改时间中的年、月、日、时、分、秒等
     * Calendar类的常见方法：
     *  1. public static Calendar getInstance()：获取当前日历对象
     *  2. public int get(int field)：获取日历中的某个信息
     *  3. public final Date getTime()：获取日期对象
     *  4. public long getTimeInMillis()：获取时间毫秒值
     *  5. public void set(int field, int value)：修改日历的某个信息
     *  6. public void add(int field, int amount)：为某个信息增加或减少指定的值
     *
     * Calender是可变对象，一旦修改后其对象本身表示的时间也会改变
     */

    public static void main(String[] args) {

        // 获取系统此刻时间对应的当前日历对象
        Calendar now = Calendar.getInstance();
        // 注意：Calendar类的月份是从0开始的，所以要加1
        System.out.println(now);

        // 获取日历中某个信息
        int year = now.get(Calendar.YEAR);
        System.out.println(year);
        int month = now.get(Calendar.MONTH) + 1;
        System.out.println(month);
        int day = now.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);

        // 获取日历中记录的日期对象
        Date date = now.getTime();
        System.out.println(date);

        // 获取时间毫秒值
        long time = now.getTimeInMillis();
        System.out.println(time);

        // 修改日历的某个信息
        now.set(Calendar.MONTH,11); // 修改为11+1月
        month = now.get(Calendar.MONTH) + 1;
        System.out.println(month);

        // 为某个信息增加或减少指定的值
        now.add(Calendar.DAY_OF_YEAR, 10);
        System.out.println(now);
        now.add(Calendar.DAY_OF_YEAR, -10);
        System.out.println(now);
    }
}
