package com.collection.demo12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class A {
    /**
     * Map的遍历方式：
     *  1. 键找值
     *  2. 键值对
     *  3. Lambda表达式
     *
     * 键找值：
     *  1. 先把键都获取出来，放到一个单列集合中
     *  2. 遍历单列集合得到里面的每一个键
     *  3. 再通过get()方法依次获取每一个键对应的值
     *
     * 键值对：
     *  1. 依次获取集合中每一对键值对对象
     *  2. 通过getKey()方法获取里面的键
     *  3. 通过getValue()方法获取里面的值
     *  4. 对每一个键值对对象进行2和3操作，即可遍历整个集合
     */
    public static void main(String[] args) {
        // 创建Map集合的对象
        Map<String, String> map = new HashMap<>();

        // 添加元素
        map.put("大卫", "露西");
        map.put("鲁迪乌斯", "希露菲");
        map.put("鸣人", "雏田");
        map.put("佐助", "小樱");
        System.out.println(map);

        // test01(map);
        // test02(map);
        test03(map);
    }

    /**
     * Lambda表达式
     * @param map
     */
    public static void test03(Map<String, String> map){
        // 利用Lambda表达式进行遍历
        // 这里forEach方法的底层：
        // forEach其实就是利用键值对的方式进行遍历，依次得到每一个键和值
        // 然后再调用accept()方法
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + "=" + value);
            }
        });

        // Lambda表达式简化
        // map.forEach((key, value)->System.out.println(key + "=" + value));
    }

    /**
     * 键值对
     * @param map
     */
    public static void test02(Map<String, String> map){
        // 通过键值对
        // 1. 通过entrySet()方法获取所有的键值对对象，返回一个Set集合
        // Map.Entry：表示Entry是Map接口中的一个内部接口
        Set<Map.Entry<String, String>> entries = map.entrySet();
        // 2. 遍历entries这个集合，去得到里面的每一个键值对对象
        entries.forEach(obj->{
            // 3. 利用entries去调用getKey()方法和getValue()方法，获取键和值
            String key = obj.getKey();
            String value = obj.getValue();
            System.out.println(key + "=" + value);
        });
    }

    /**
     * 键找值
     * @param map
     */
    public static void test01(Map<String, String> map){
        // 通过键找值
        // 1. 获取所有的键，把这些键放到一个单列集合中
        Set<String> keys = map.keySet();
        // 2. 遍历单列集合，得到每一个键
        keys.forEach(key-> {
            // System.out.println(key);
            // 3. 利用Map集合中的键获取对应的值 get()
            String val = map.get(key);
            System.out.println(key + "=" + val);
        });
    }
}
