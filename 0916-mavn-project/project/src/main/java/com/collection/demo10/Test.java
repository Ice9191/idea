package com.collection.demo10;

import com.collection.demo09.Student;

import java.util.LinkedHashSet;

public class Test {
    /**
     * LinkedHashSet底层原理：
     *  有序、不重复、无索引
     *  这里的有序指的是保证存储和取出的元素顺序一致
     *  原理：底层数据结构依然是哈希表，只是每个元素又额外的多了一个双链表的机制记录存储的顺序
     *
     * 在以后如果要数据去重，我们使用哪个？
     *  默认使用HashSet
     *  如果要求去重且存取有序，才使用LinkedHashSet，效率较低
     */
    public static void main(String[] args) {
        // 创建4个学生对象
        Student s1 = new Student("张三", 23);
        Student s2 = new Student("李四", 24);
        Student s3 = new Student("王五", 25);
        Student s4 = new Student("张三", 23);

        // 创建集合的对象
        LinkedHashSet<Student> lhs = new LinkedHashSet<>();

        // 添加元素
        System.out.println(lhs.add(s2)); // true
        System.out.println(lhs.add(s3)); // true
        System.out.println(lhs.add(s1)); // true
        System.out.println(lhs.add(s4)); // false

        // 打印集合
        System.out.println(lhs);
    }
}
