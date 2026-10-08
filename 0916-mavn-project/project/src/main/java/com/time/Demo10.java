package com.time;

import java.time.Duration;
import java.time.LocalDateTime;

public class Demo10 {
    /**
     * Duration类：可以用于计算两个时间对象相差的天数、小时数、分钟数、秒数、纳秒数；支持LocalTime、LocalDateTime、Instant等时间类
     * Duration类常见方法：
     *  1. public static Duration between(开始时间对象1, 结束时间对象2)：传入2个LocalTime对象，得到Duration对象
     *  2. public long toDays()：获取相差的天数
     *  3. public long toHours()：获取相差的小时数
     *  4. public long toMinutes()：获取相差的分钟数
     *  5. public long toSeconds()：获取相差的秒数
     *  6. public long toMillis()：获取相差的毫秒数
     *  7. public long toNanos()：获取相差的纳秒数
     */

    public static void main(String[] args) {

        LocalDateTime start = LocalDateTime.of(2027, 8, 5, 7, 0, 0);
        LocalDateTime end = LocalDateTime.of(2027, 9, 6, 12, 11, 10);

        // 得到Duration对象，封装2个LocalTime对象
        Duration duration = Duration.between(start, end);

        // 获取相差的天数、小时数、分钟数、秒数、毫秒数、纳秒数
        System.out.println(duration.toDays());
        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());
        System.out.println(duration.toSeconds());
        System.out.println(duration.toMillis());
        System.out.println(duration.toNanos());
    }
}
