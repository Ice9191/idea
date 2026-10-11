package com.collection.demo04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class A {
    /**
     * List集合的遍历方式：
     *  1. 迭代器遍历
     *  2. 列表迭代器遍历
     *  3. 增强for遍历
     *  4. Lambda表达式遍历
     *  5. 普通for循环遍历(因为List集合存在索引)
     *
     * 五种遍历方式对比：
     *  1. 在遍历过程中需要删除元素，请使用迭代器
     *  2. 在遍历的过程中需要添加元素，请使用列表迭代器
     *  3. 仅仅想遍历，那么使用增强for或Lambda表达式
     *  4. 如果遍历的时候想操作索引，可以使用普通for
     */
    public static void main(String[] args) {
        // 创建集合并添加元素，多态的方式创建
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        // test01(list);
        // test02(list);
        // test03(list);
        // test04(list);
        test05(list);
    }

    /**
     * 迭代器方式遍历
     * @param list
     */
    public static void test01(List<String> list){
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }
    }

    /**
     * 增强for遍历方式
     * @param list
     */
    public static void test02(List<String> list){
        // 变量s其实就是一个第三方变量而已，在循环过程中，依次表示集合中的每一个元素
        for (String s : list) {
            System.out.println(s);
        }
    }

    /**
     * Lambda表达式遍历方式
     * @param list
     */
    public static void test03(List<String> list){
        list.forEach(s -> System.out.println(s));
    }

    /**
     * 普通for循环遍历方式
     * @param list
     */
    public static void test04(List<String> list){
        // 利用size()方法和get()方法还有循环结合的方式，利用索引获取到集合中的每一个元素
        for (int i = 0; i < list.size(); i++) {
            // i：依次表示集合中的每一个索引
            String s = list.get(i);
            System.out.println(s);
        }
    }

    /**
     * 列表迭代器遍历方式
     * @param list
     */
    public static void test05(List<String> list){
        // 获取一个列表迭代器的对象，里面的指针默认也是指向0索引的
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            String str = listIterator.next();
            if("bbb".equals(str)){
                // 不能用集合的方法添加或删除集合中的元素
                // 要用列表迭代器的方法添加或删除集合中的元素
                listIterator.add("qqq");
            }
            System.out.println(str);
        }
        System.out.println(list);
    }
}
