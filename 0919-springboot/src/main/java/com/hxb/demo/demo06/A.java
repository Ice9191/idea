package com.hxb.demo.demo06;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A {
    /**
     * Map的of方法()的细节：
     *  1. 键是不能重复的
     *  2. Map里面的of()方法，参数是有上限的，最多只能传递20个参数，10个键值对
     *  3. 如果我们要传递多个键值对对象，数量大于10个，在Map接口中还有一个方法ofEntries()
     */
    public static void main(String[] args) {
        // 创建一个普通的Map集合
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("1", "张三");
        hashMap.put("2", "李四");
        hashMap.put("3", "王五");
        hashMap.put("4", "赵六");
        hashMap.put("5", "孙七");
        hashMap.put("6", "周八");
        hashMap.put("7", "吴九");
        hashMap.put("8", "郑十");
        hashMap.put("9", "王十");
        hashMap.put("10", "赵十");
        hashMap.put("11", "aaa");

        // 利用上面的数据来获取一个不可变的集合
        // 获取到所有的键值对对象(也就是Entry对象)
        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
        // 可变参数底层就是一个数组，因此需要把entries变成一个数组，然后再传入ofEntries()方法中
        // 这个数组里面装的就是所有的键值对对象，类型就是Map.Entry<String, String>
        // toArray()方法在底层会比较集合的长度跟数组的长度两者的大小，因此不用太在意数组的长度应该设置多少
        // 如果集合的长度 > 数组的长度 : 表示数据在数组中放不下，此时会根据实际数据的个数，重新创建数组
        // 如果集合的长度 <= 数组的长度 : 表示数据在数组中放得下，此时不会创建新的数组，而是直接用就可以了
        Map.Entry[] array = entries.toArray(new Map.Entry[0]);
        // 先理解一下上面这一行代码，若调用的是没有参数的toArray()方法，相当于没有指定类型，那么它返回的数组就是Object类型
        Object[] objects = entries.toArray();
        // 遍历一下这个数组
        for (Object object : objects) {
            System.out.println(object); // 可以打印出每一个键值对对象，但是它是Object类型的，不是我想要的，因此需要指定类型
        }
        System.out.println("-----------------");

        // 因为ofEntries()方法的形参是可变参数，可变参数在底层就是一个数组，所以直接把array数组传递过去就可以了
        // 这个Map集合就是不可变的Map集合
        Map map = Map.ofEntries(array);

        // 尝试添加
        // map.put("bbb", "222");
    }

    /**
     * 对上述代码进行简化
     * @param hashMap
     */
    public static void test01(HashMap<String, String> hashMap){
        Map<Object, Object> map = Map.ofEntries(hashMap.entrySet().toArray(new Map.Entry[0]));
    }

    /**
     * 使用Map.copyOf()方法直接创建不可变的集合，只在JDK10的时候才出现
     * @param hashMap
     */
    public static void test02(HashMap<String, String> hashMap){
        // copyOf()方法：当我们传递一个Map集合的时候，方法底层会做判断，如果传递过来的Map集合
        // 就是一个不可变的集合，那么直接把本身的集合返回；但是如果传递过来的Map集合是可变的，那么就会执行test01方法中
        // 的简化写法，去自动的创建一个不可变的集合并且返回
        Map<String, String> map = Map.copyOf(hashMap);
    }

    /**
     * 如果我想让这个方法能接收多个键和值
     * 解决方案：键写成可变参数，值也写成可变参数
     * 键和值的类型不确定，可以使用泛型方法
     * 问题：可变参数必须在形参的最后，不能有多个可变参数，所以of方法不可行
     */
    // public static <K, V> void of(K... keys, V... values){}
}
