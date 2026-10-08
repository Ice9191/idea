package com.time;

import java.time.LocalDate;
import java.time.Period;

public class Demo09 {
    /**
     * Period类：可以用于计算两个LocalDate对象之间相差的年、月、日
     * Period类常见方法：
     *  1. public static Period between(LocalDate start, LocalDate end)：传入2个日期对象，得到Period对象
     *  2. public int getYears()：获取相差的年数
     *  3. public int getMonths()：获取相差的月数
     *  4. public int getDays()：获取相差的日数
     */

    public static void main(String[] args) {

        // 创建一个Period对象，封装2个日期对象
        LocalDate start = LocalDate.of(2027, 8, 5);
        LocalDate end = LocalDate.of(2077, 12, 6);
        Period period = Period.between(start, end);

        // 通过Period对象获取相差的年、月、日
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
    }
}
