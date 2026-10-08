package com.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDateTime;

public class Demo05 {
    /**
     * LocalDate类：代表本地日期（年、月、日、星期）
     * LocalTime类：代表本地时间（时、分、秒、纳秒）
     * LocalDateTime类：代表本地日期、时间（年、月、日、星期 时、分、秒、纳秒）（用的最多）
     *
     * 它们获取对象的方法：
     *  public static LocalDate now()：获取当前日期对象
     *  public static LocalTime now()：获取当前时间对象
     *  public static LocalDateTime now()：获取当前日期时间对象
     */

    public static void main(String[] args) {

        // 获取当前日期对象
        LocalDate localDate = LocalDate.now(); // 年-月-日
        System.out.println(localDate);
        // 获取日期对象中的信息
        int year = localDate.getYear(); // 年
        System.out.println(year);
        int month = localDate.getMonthValue(); // 月
        System.out.println(month);
        int day = localDate.getDayOfMonth(); // 日
        System.out.println(day);
        int dayOfYear = localDate.getDayOfYear(); // 一年中的第几天
        System.out.println(dayOfYear);
        int dayOfWeek = localDate.getDayOfWeek().getValue(); // 星期几
        System.out.println(dayOfWeek);
        // 直接修改某个信息
        LocalDate lwy = localDate.withYear(2077);// 修改为2077年
        System.out.println(lwy); // 基于原来的日期对象，创建了一个新的日期对象
        LocalDate lwm = localDate.withMonth(12); // 修改为12月
        System.out.println(lwm); // 基于原来的日期对象，又创建了一个新的日期对象
        System.out.println(localDate); // 不会改变原来的日期对象
        // 把某个信息加多少
        LocalDate lpy = localDate.plusYears(10);
        System.out.println(lpy);
        // 把某个信息减多少
        LocalDate lpm = localDate.minusMonths(5);
        System.out.println(lpm);
        // 获取指定日期的LocalDate对象：public static LocalDate of(int year, int month, int dayOfMonth)
        LocalDate lpd1 = LocalDate.of(2023, 12, 31);
        System.out.println(lpd1);
        LocalDate lpd2 = LocalDate.of(2077, 12, 31);
        System.out.println(lpd2);
        // 判断2个日期对象是否相等，在前还是在后：equals()、isBefore()、isAfter()
        System.out.println(lpd1.equals(lpd2)); // false
        System.out.println(lpd1.isBefore(lpd2)); // true
        System.out.println(lpd1.isAfter(lpd2)); // false
        // 后面的LocalDateTime类和LocalTime类也类似

        System.out.println("-----------------");

        // 可以把LocalDateTime类转换为LocalDate类、LocalTime类
        // public LocalDate toLocalDate()：转换为LocalDate类
        // public LocalTime toLocalTime()：转换为LocalTime类
        // public static LocalDateTime of(LocalDate date, LocalTime time)：根据日期和时间创建LocalDateTime对象
        LocalDateTime ldt = LocalDateTime.now();
        LocalDate ld = ldt.toLocalDate();
        System.out.println(ld);
        LocalTime lt = ldt.toLocalTime();
        System.out.println(lt);
        LocalDateTime ldt2 = LocalDateTime.of(ld, lt);
        System.out.println(ldt2);
    }
}
