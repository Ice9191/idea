package com.collection.demo09;

import java.util.HashSet;

public class C {
    /**
     * 案例：利用HashSet集合去除重复元素
     *  需求：创建一个存储学生对象的集合，存储多个学生对象
     *  使用程序实现在控制台遍历该集合
     *  要求：学生对象的成员变量值相同，我们就认为是同一个对象
     */
    public static void main(String[] args) {
        // 创建学生对象
        Student s1 = new Student("张三", 23);
        Student s2 = new Student("李四", 24);
        Student s3 = new Student("王五", 25);
        Student s4 = new Student("张三", 23);

        // 创建集合用来添加学生
        HashSet<Student> hs = new HashSet<>();

        // 添加元素
        System.out.println(hs.add(s1)); // true
        System.out.println(hs.add(s2)); // true
        System.out.println(hs.add(s3)); // true
        System.out.println(hs.add(s4)); // false

        // 打印集合
        System.out.println(hs);
    }
}
