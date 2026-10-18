package com.collection.demo15;

import java.util.LinkedHashMap;

public class Test {
    /**
     * LinkedHashMap
     *  由键决定：有序、不重复、无索引
     *  这里的有序指的是保证存储和取出的元素顺序一致
     *  原理：底层数据结构依然是哈希表，只是每个键值对元素又额外的多了一个双链表的机制记录存储的顺序
     */
    public static void main(String[] args) {
        // 创建集合
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        // 添加元素
        lhm.put("a", 123);
        // 保证键的唯一
        // lhm.put("a", 123);
        // 覆盖
        lhm.put("a", 111);
        lhm.put("c", 789);
        lhm.put("b", 456);

        // 打印集合
        System.out.println(lhm);
    }
}
