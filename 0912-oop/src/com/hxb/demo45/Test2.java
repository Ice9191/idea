package com.hxb.demo45;

public class Test2 {
    /**
     * 自动装箱和自动拆箱：
     *  JDK5的时候才出现的
     *  箱：对象
     *  自动装箱：JVM会自动的把基本数据类型装到一个对象当中，底层调用了valueOf方法
     *      Integer i1 = 100; 等价于 Integer i1 = Integer.valueOf(100);
     *  自动拆箱：JVM会自动的把对象中的基本数据类型拿出来，底层调用了intValue方法
     *
     *  因为自动装箱和自动拆箱的出现，所以可以认为Integer和int是等价的
     */

    static void main() {

        Integer i1 = 100; // 等价于 Integer i1 = Integer.valueOf(100);
        Integer i2 = 200; // 等价于 Integer i2 = Integer.valueOf(200);
        Integer i3 = i1 + i2; // 等价于 Integer i3 = Integer.valueOf(i1.intValue() + i2.intValue());
        System.out.println(i3); // 300
    }
}
