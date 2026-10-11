package com.collection.demo04;

import java.util.ArrayList;
import java.util.List;

public class Test {
    /**
     * List集合的特点：
     *  1. 有序：存和取的元素顺序一致
     *  2. 有索引：可以通过索引操作元素
     *  3. 可重复：存储的元素可以重复
     *
     * List集合的特有方法：
     *  1. Collection的方法List都继承了
     *  2. List集合因为有索引，所以多了很多索引操作的方法
     *  常用方法：
     *      void add(int index, E element)：在此集合中的指定位置插入指定的元素
     *      E remove(int index)：删除指定索引处的元素，并返回被删除的元素
     *      E set(int index, E element)：修改指定索引处的元素，并返回被修改的元素
     *      E get(int index)：返回指定索引处的元素
     */
    public static void main(String[] args) {
        test01();
        // test02();
    }

    public static void test01(){
        // 创建List实现类的对象集合
        List<String> list = new ArrayList<>();

        // 添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        // add()方法在指定位置添加元素
        // 细节：原来索引上的元素会依次往后移
        list.add(1, "qqq");

        // remove()方法删除指定索引处的元素
        String remove = list.remove(0);
        System.out.println(remove);

        // set()方法修改指定索引处的元素
        String set = list.set(0, "QQQ");
        System.out.println(set);

        // get()方法返回指定索引处的元素
        String str = list.get(0);
        System.out.println(str);

        // 打印集合
        System.out.println(list);
    }

    public static void test02(){
        /**
         * List系列集合中的两个删除方法
         *  1. 直接删除元素
         *  2. 通过索引进行删除
         */
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // 删除元素
        // 此时删除的是1这个元素，还是1索引上的元素？
        // 为什么删除的是索引1上的元素，而不是1这个元素？
        // 因为在调用方法时，如果方法出现了重载现象，会优先调用实参和形参类型一致的方法
        // list.remove(1);

        // 删除1这个元素
        // 手动装箱，手动把基本数据类型的1，变成Integer类型
        Integer i = Integer.valueOf(1);
        list.remove(i);

        System.out.println(list);
    }
}
