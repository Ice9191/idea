package com.collection.demo09;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {
    /**
     * Set系列集合：
     *  无序：存取顺序不一致
     *  不重复：可以去除重复
     *  无索引：没有带索引的方法，所以不能使用普通for循环遍历，也不能通过索引来获取元素
     * Set集合的实现类：
     *  HashSet：无序，不重复，无索引
     *  LinkedHashSet：有序，不重复，无索引
     *  TreeSet：可排序，不重复，无索引
     * Set接口中的方法上基本与Collection的API一致
     */

    /**
     * 练习：存储字符串并遍历
     *  利用Set系列的集合，添加字符串，并使用多种方式遍历
     *      1. 迭代器
     *      2. 增强for
     *      3. Lambda表达式
     */
    public static void main(String[] args) {
        // 创建一个Set集合的对象
        Set<String> s= new HashSet<>();

        Set<String> set = new HashSet<>();
        set.add("张三");
        set.add("李四");
        set.add("王五");
        System.out.println(set);

        // test01(s);
        // test02(set);
        // test03(set);
        test04(set);
    }

    public static void test01(Set<String> s){
        // 添加元素
        // add()方法：如果当前是第一次添加，返回true
        // 如果当前元素已经存在，返回false
        boolean str1 = s.add("张三");
        boolean str2 = s.add("张三");
        s.add("李四");
        s.add("王五");

        // 无索引，没有get()方法
        // s.get();

        System.out.println(str1); // true
        System.out.println(str2); // false
        // 无序
        System.out.println(s);
    }

    /**
     * 迭代器遍历
     * @param s
     */
    public static void test02(Set<String> s){
        Iterator<String> iterator = s.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }
    }

    /**
     * 增强for遍历
     * @param s
     */
    public static void test03(Set<String> s){
        for (String str : s) {
            System.out.println(str);
        }
    }

    /**
     * Lambda表达式遍历
     * @param s
     */
    public static void test04(Set<String> s){
        s.forEach(str-> System.out.println(str));
    }
}
