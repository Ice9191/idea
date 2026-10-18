package com.collection.demo16;

import java.util.Comparator;
import java.util.TreeMap;

public class Test {
    /**
     * TreeMap
     *  TreeMap跟TreeSet底层原理一样，都是红黑树结构的
     *  由键决定特性：不重复、无索引、可排序
     *  可排序：对键进行排序
     *  注意：默认按照键的从小到大进行排序，也可以自己规定键的排序规则
     *
     * 代码书写两种排序规则
     *  实现Comparable接口，指定比较规则
     *  创建集合时传递Comparator比较器的对象，指定比较规则
     */

    /**
     * TreeMap基本应用
     *  需求1:
     *      键：整数表示id
     *      值：字符串表示商品名称
     *      要求：按照id的升序排序、按照id的降序排序
     *  需求2:
     *      键：学生对象
     *      值：籍贯
     *      要求：按照学生年龄的升序排序，年龄一样按照姓名的字母排列，同姓名年龄视为同一个人
     */
    public static void main(String[] args) {
        // test01();
        test02();
    }

    public static void test01(){
        // 创建集合对象
        // Integer和Double默认情况下都是按照升序排序的
        // String按照字母在ASCII码表中对应的数字升序进行排序
        TreeMap<Integer, String> treeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // o1：表示当前要添加的元素
                // o2：表示已经在红黑树中存在的元素
                return o2 - o1;
            }
        });

        // 添加元素
        treeMap.put(5, "肯德基");
        treeMap.put(1, "奥利奥");
        treeMap.put(4, "可乐");
        treeMap.put(3, "雪碧");
        treeMap.put(2, "康师傅");

        // 打印集合
        System.out.println(treeMap);
    }

    public static void test02(){
        // 创建集合
        TreeMap<Student, String> tm = new TreeMap<>();

        // 创建三个学生对象
        Student s1 = new Student("张三", 23);
        Student s2 = new Student("李四", 24);
        Student s3 = new Student("王五", 25);

        // 添加元素
        tm.put(s1, "北京");
        tm.put(s2, "上海");
        tm.put(s3, "广州");

        // 打印集合
        System.out.println(tm);
    }
}
