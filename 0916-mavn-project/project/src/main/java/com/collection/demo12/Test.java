package com.collection.demo12;

import java.util.HashMap;
import java.util.Map;

public class Test {
    /**
     * 双列集合的特点：
     *  1. 双列集合一次需要存一对数据，分别为键和值
     *  2. 键不能重复，值可以重复
     *  3. 键和值是一一对应的，每一个键只能找到自己对应的值
     *  4. 键+值这个整体，我们称之为“键值对”或者“键值对对象”，在java中叫做“Entry对象”
     *  Map是最顶层的接口：
     *      HashMap：实现类
     *          LinkedHashMap：实现类
     *      TreeMap：实现类
     *
     * Map的常见API：Map是双列集合的顶层接口，它的功能是全部双列集合都可以继承使用的
     *  V put(K key, V value)：添加元素
     *  V remove(Object key)：根据键删除键值对元素
     *  void clear()：移除所有的键值对元素
     *  boolean containsKey(Object key)：判断集合中是否包含指定的键
     *  boolean containsValue(Object value)：判断集合中是否包含指定的值
     *  boolean isEmpty()：判断集合是否为空
     *  int size()：集合的长度，也就是集合中键值对的个数
     */
    public static void main(String[] args) {
        // 创建Map集合的对象(键和值都是字符串)
        // 因为我们要学习Map集合中的方法，所以才用多态的方式创建对象
        Map<String, String> map = new HashMap<>();

        // test01(map);
        // test02(map);
        // test03(map);
        // test04(map);
        // test05(map);
        test06(map);
    }

    /**
     * 添加元素
     * @param map
     */
    public static void test01(Map<String, String> map){
        map.put("大卫", "露西");
        map.put("鲁迪乌斯", "希露菲");
        map.put("鸣人", "雏田");
        String s = map.put("佐助", "小樱");
        System.out.println(s); // null

        // put()方法的返回值
        // put()方法的细节：有添加和覆盖的作用
        // 在添加数据的时候，如果键不存在，那么直接把键值对对象添加到Map集合中去，方法返回null
        // 在添加数据的时候，如果键存在，那么会把原有的键值对对象覆盖，会把被覆盖的值进行返回
        String put = map.put("鲁迪乌斯", "艾莉丝");
        System.out.println(put); // 希露菲

        // 打印集合
        System.out.println(map);
    }

    /**
     * 删除元素
     * @param map
     */
    public static void test02(Map<String, String> map){
        map.put("大卫", "露西");
        map.put("鲁迪乌斯", "希露菲");
        map.put("鸣人", "雏田");
        map.put("佐助", "小樱");

        String result = map.remove("大卫");
        System.out.println(result); // 露西

        // 打印集合
        System.out.println(map);
    }

    /**
     * 清空元素
     * @param map
     */
    public static void test03(Map<String, String> map){
        map.put("大卫", "露西");
        map.put("鲁迪乌斯", "希露菲");
        map.put("鸣人", "雏田");
        map.put("佐助", "小樱");

        map.clear(); // {}

        // 打印集合
        System.out.println(map);
    }

    /**
     * 判断是否包含指定的键或值
     * @param map
     */
    public static void test04(Map<String, String> map){
        map.put("大卫", "露西");
        map.put("鲁迪乌斯", "希露菲");
        map.put("鸣人", "雏田");
        map.put("佐助", "小樱");

        // 判断是否包含指定的键或值
        boolean result = map.containsKey("大卫");
        System.out.println(result); // true
        boolean result2 = map.containsKey("大伟");
        System.out.println(result2); // false

        boolean valResult = map.containsValue("小樱");
        System.out.println(valResult); // true
        boolean valResult2 = map.containsValue("小樱子");
        System.out.println(valResult2); // false

        // 打印集合
        System.out.println(map);
    }

    /**
     * 判断集合是否为空
     * @param map
     */
    public static void test05(Map<String, String> map){
        map.put("大卫", "露西");
        map.put("鲁迪乌斯", "希露菲");
        map.put("鸣人", "雏田");
        map.put("佐助", "小樱");

        boolean res = map.isEmpty();
        System.out.println(res); // false

        map.clear();
        boolean res2 = map.isEmpty();
        System.out.println(res2); // true

        // 打印集合
        System.out.println(map);
    }

    /**
     * 获取集合的长度
     * @param map
     */
    public static void test06(Map<String, String> map){
        map.put("大卫", "露西");
        map.put("鲁迪乌斯", "希露菲");
        map.put("鸣人", "雏田");
        map.put("佐助", "小樱");

        int size = map.size();
        System.out.println(size); // 4

        // 打印集合
        System.out.println(map);
    }
}
