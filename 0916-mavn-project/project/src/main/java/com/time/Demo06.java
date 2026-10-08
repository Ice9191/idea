package com.time;

import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class Demo06 {
    /**
     * 时区：由于世界各个国家与地区的经度不同，各地区的时间也不同，因为会划分不同的时区
     * 全世界一共分为24个时区，每个时区的时间差为1小时，北京时区为东八区
     * 世界标准时间（UTC）：0时区的时间
     * 中国标准时间：世界标准时间（UTC）+8小时 = 东八区的时间
     *
     * ZoneId：代表时区Id
     */

    public static void main(String[] args) {

        // ZoneId常见方法：
        // public static ZoneId systemDefault()：获取系统默认时区Id
        ZoneId zi = ZoneId.systemDefault();
        System.out.println(zi.getId());
        System.out.println(zi.toString()); // 实际就是zi.getId()，可以省略toString()，直接打印zi，得到的结果一样

        // public static Set<String> getAvailableZoneIds()：获取java支持的所有时区Id
        Set<String> azi = ZoneId.getAvailableZoneIds();
        System.out.println(azi);

        // public static ZoneId of(String zoneId)：把某个时区id封装为ZoneId对象
        ZoneId zoneId = ZoneId.of("America/New_York");
        System.out.println(zoneId);

        // ZoneDateTime：带时区的时间对象
        // public static ZoneDateTime now(ZoneId zone)：获取某个时区的ZoneDateTime对象
        ZonedDateTime now = ZonedDateTime.now(zoneId);
        System.out.println(now);

        // 获取世界标准时间（UTC）对象
        ZonedDateTime utc = ZonedDateTime.now(Clock.systemUTC());
        System.out.println(utc);

        // public static ZoneDateTime now()：获取系统默认时区的ZoneDateTime对象
        ZonedDateTime cur = ZonedDateTime.now();
        System.out.println(cur);

        // ZonedDateTime的对时间的操作和LocalDateTime几乎相同
    }
}
