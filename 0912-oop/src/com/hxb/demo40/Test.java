package com.hxb.demo40;

import java.util.ArrayList;

public class Test {
    /**
     * 集合：是一种长度可变的容器
     * ArrayList
     *  构造方法：
     *      ArrayList()：创建一个空的ArrayList容器
     *  方法：
     *      增：boolean add(E e) 把元素添加到末尾；void add(int index, E e) 把元素添加到指定的索引
     *      删：boolean remove(E e) 根据元素进行删除；E remove(int index) 根据索引进行删除
     *      改：E set(int index, E e) 把指定索引的元素修改为新的元素
     *      查：E get(int index) 获取指定索引的元素；int size() 获取集合的长度
     */

    static void main() {

        // 创建一个长度为0的ArrayList集合
        // 问题：不能判断集合中到底能存储什么类型的数据
        // 如果没有进行限定，此时集合里面可以存储任意数据类型的数据
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add(new Student() {
            @Override
            public void study() {

            }
        });
        list.add(new Teacher());
        // System.out.println(list);
        // 导致：取出来的时候无法确定类型，并且会导致多态的弊端：无法使用子类的特有方法
        Object o = list.get(1);
        // System.out.println(o);

        // 为了解决这一问题，提出了泛型
        // 泛型：限定集合当中的数据类型
        // 泛型格式：<数据类型>
        // 用泛型去限定集合中能存储什么类型的数据
        ArrayList<String> li = new ArrayList<String>();
        li.add("abc");
        // li.add(new Teacher());
        String s = li.get(0);

        // JDK7新规则：后面的泛型可以省略不写，但是<>必须保留
        ArrayList<String> lis = new ArrayList<>();
    }
}
