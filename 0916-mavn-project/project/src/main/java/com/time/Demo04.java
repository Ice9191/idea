package com.time;

public class Demo04 {
    /**
     * 传统时间类（Date类、Calendar类、SimpleDateFormat类）存在如下问题：
     *  1. 设计不合理，使用不方便，很多都被淘汰了
     *  2. 都是可变对象，修改后会丢失最开始的时间信息
     *  3. 线程不安全，比如很多人一起使用修改时间，会导致时间信息不一致
     *  4. 不能精确到纳秒，只能精确到毫秒级
     *
     * JDK8开始之后新增的时间API：
     *  1. 设计更合理，功能丰富，使用更方便
     *  2. 都是不可变对象，修改后会返回新的时间对象，不会丢失最开始的时间
     *  3. 线程安全
     *  4. 可以精确到毫秒级、纳秒级
     *
     * 代替Calendar类：
     *  localDate：年、月、日
     *  localTime：时、分、秒
     *  localDateTime：年、月、日 时、分、秒
     *  ZoneId：时区
     *  ZoneDateTime：带时区的时间
     *
     * 代替Date类：
     *  Instant：时间戳/时间线
     *
     * 代替SimpleDateFormat类：
     *  DateTimeFormatter：用于时间的格式化和解析
     *
     * 其他补充：
     *  Period：日期间隔（年、月、日）
     *  Duration：时间间隔（时、分、秒、毫秒、纳秒）
     */
}
