package com.collection.demo01;

import java.util.ArrayList;
import java.util.Collection;

public class A {
    public static void main(String[] args) {
        // 创建集合的对象
        Collection<Student> coll = new ArrayList<>();

        // 创建三个学生对象
        Student s1 = new Student("张三", 23);
        Student s2 = new Student("李四", 24);
        Student s3 = new Student("王五", 25);

        // 把学生对象添加到集合当中
        coll.add(s1);
        coll.add(s2);
        coll.add(s3);

        // 判断集合中某一个学生对象是否包含
        Student s4 = new Student("张三", 23);
        // 因为contains方法在底层依赖equals方法判断对象是否一致的
        // 如果存的是自定义对象，没有重写equals方法，那么默认使用Object类中的equals方法进行判断，而Object类中的equals方法默认比较的是对象的地址值
        // 需求：如果同姓名和同年龄，就认为是同一个学生
        // 所以，需要在自定义的javabean类中，重写equals方法就可以了
        System.out.println(coll.contains(s4)); // false 重写后变为 true
    }
}
