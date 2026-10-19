package com.hxb.demo.demo07;

public class B {
    /**
     * Stream流的中间方法
     *  Stream<T> filter(Predicate<? super T> predicate)：过滤
     *  Stream<T> limit(long maxSize)：获取前几个元素
     *  Stream<T> skip(long n)：跳过前几个元素
     *  Stream<T> distinct()：元素去重，依赖hashCode()方法和equals()方法
     *  static <T> Stream<T> concat(Stream a, Stream b)：合并a和b两个流为一个流
     *  Stream<R> map(Function<T, R> mapper)：转换流中的数据类型
     */
}
