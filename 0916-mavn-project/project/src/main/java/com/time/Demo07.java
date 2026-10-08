package com.time;

import java.time.Instant;

public class Demo07 {
    /**
     * Instant：通过获取Instant对象可以拿到此刻的时间，该时间由两部分组成：从1970年1月1日0时0分0秒开始走到此刻的总秒数+不够1秒的纳秒数
     *
     * Instant类的常见方法：
     *  1. public static Instant now()：获取当前时间的Instant对象（标准时间）
     *  2. public long getEpochSecond()：获取从1970年1月1日0时0分0秒开始走到此刻的总秒数
     *  3. public int getNano()：从时间线开始，获取从第二个开始的纳秒数
     *  4. plusMillis plusSeconds plusNanos：增加时间系列的方法
     *  5. minusMillis minusSeconds minusNanos：减少时间系列的方法
     *  6. equals isBefore isAfter：判断系列的方法
     */

    public static void main(String[] args) {

        // 创建Instant对象，获取此刻时间
        Instant now = Instant.now();
        System.out.println(now);

        // 获取总秒数
        long epochSecond = now.getEpochSecond();
        System.out.println(epochSecond);

        // 获取不够1秒的纳秒数
        int nano = now.getNano();
        System.out.println(nano);

        Instant i1 = now.plusNanos(1111);
        System.out.println(i1);
    }
}
