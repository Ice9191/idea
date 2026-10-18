package com.collection.demo11;

import java.util.Iterator;
import java.util.TreeSet;

public class Test {
    /**
     * TreeSet的特点：
     *  不重复、无索引、可排序
     *  可排序：按照元素的默认规则(从小到大)排序
     *  TreeSet集合底层是基于红黑树的数据结构实现排序的，增删改查性能都较好
     */

    /**
     * TreeSet对象排序练习题
     *  需求：存储整数并进行排序
     */
    public static void main(String[] args) {
        // 创建TreeSet集合的对象
        TreeSet<Integer> ts = new TreeSet<>();

        // 添加元素
        ts.add(4);
        ts.add(2);
        ts.add(7);
        ts.add(8);
        ts.add(1);
        ts.add(3);

        // 打印集合
        System.out.println(ts);

        // test01(ts);
        // test02(ts);
        test03(ts);
    }

    /**
     * 迭代器遍历
     * @param ts
     */
    public static void test01(TreeSet<Integer> ts){
        Iterator<Integer> iterator = ts.iterator();
        while (iterator.hasNext()){
            // 自动装箱、自动拆箱
            int s = iterator.next();
            System.out.println(s);
        }
    }

    /**
     * 增强for遍历
     * @param ts
     */
    public static void test02(TreeSet<Integer> ts){
        for (Integer i : ts) {
            System.out.println(i);
        }
    }

    /**
     * Lambda表达式遍历
     * @param ts
     */
    public static void test03(TreeSet<Integer> ts){
        ts.forEach(s-> System.out.println(s));
    }
}
