package com.hxb.demo.demo07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Stream;

public class A {
    /**
     * Stream流的思想：流水线
     *  过滤操作：留下张开头的 -> 过滤操作：留下长度为3的 -> 输出操作
     * Stream流的作用：结合了Lambda表达式，简化集合、数组的操作
     * Stream流的使用步骤：
     *  1. 先得到一条Stream流(流水线)，并把数据放上去
     *  2. 利用Stream流中的API进行各种操作，比如过滤、转换、统计、打印等等
     *      中间方法：方法调用完毕之后，还可以调用其他方法
     *          1. 过滤
     *          2. 转换
     *      终结方法：Stream流中的最后一步，调用完毕之后，不能调用其他方法
     *          1. 统计
     *          2. 打印
     *  3. 先使用中间方法对流水线上的数据进行操作，然后再使用终结方法对流水线上的数据进行操作
     *
     * 如何获取一条Stream流？
     *  单列集合：default Stream<E> stream()：Collection中的默认方法，获取一条Stream流，并把集合中的数据放到这条流水线上
     *  双列集合：不能直接使用Stream流，需要通过keySet()、\entrySet()方法先转成单列集合，然后再获取Stream流
     *  数组：public static <T> Stream<T> stream(T[] array)：Arrays工具类中的静态方法，获取一条Stream流，并把数组中的数据放到这条流水线上
     *  一堆零散的数据：public static <T> Stream<T> of(T... values)：Stream接口中的静态方法，这些数据需要是同种数据类型
     */
    public static void main(String[] args) {
        // test01();
        // test02();
        // test03();
        test04();
    }

    /**
     * 单列集合获取Stream流
     */
    public static void test01(){
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰");
        // ArrayList是Collection这个接口的实现类，所以list可以直接调用Collection接口中的方法
        // 获取到一条流水线，并把集合中的数据放到这条流水线上
        Stream<String> stream = list.stream();
        // 使用终结方法打印一下流水线上的所有数据
        stream.forEach(s-> System.out.println(s));
        // 简化写法
        // list.stream().forEach(s-> System.out.println(s));
    }

    /**
     * 双列集合获取Stream流
     */
    public static void test02(){
        // 创建双列集合
        HashMap<String, Integer> hashMap = new HashMap<>();
        // 添加数据
        hashMap.put("张无忌", 18);
        hashMap.put("周芷若", 19);
        hashMap.put("赵敏", 20);
        hashMap.put("张强", 21);
        hashMap.put("张三丰", 22);
        // 第一种获取Stream流
        // hashMap.keySet().stream().forEach(s-> System.out.println(s));
        // 第二种获取Stream流
        hashMap.entrySet().stream().forEach(s-> System.out.println(s));
    }

    /**
     * 数组获取Stream流
     */
    public static void test03(){
        // 创建数组
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        String[] arrStr = {"张无忌", "周芷若", "赵敏", "张强", "张三丰"};
        // 获取Stream流
        Arrays.stream(arr).forEach(s-> System.out.println(s));
        System.out.println("-----------------");
        Arrays.stream(arrStr).forEach(s-> System.out.println(s));
    }

    /**
     * 一堆零散的数据获取Stream流(数据类型需要是同种数据类型)
     */
    public static void test04(){
        /**
         * Stream接口中静态方法of的细节：
         *  方法的形参是一个可变参数，可以传递一堆零散的数据，也可以传递数组，
         *  但是数组必须是引用数据类型的，如果传递的是基本数据类型，是不会整体的自动装箱的，
         *  是会把整个数组当作一个元素，放到Stream流当中
         */
        Stream.of(1,2,3,4,5).forEach(s-> System.out.println(s));
        Stream.of("张无忌", "周芷若", "赵敏", "张强", "张三丰").forEach(s-> System.out.println(s));
    }
}
