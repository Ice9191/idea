package com.collection.demo09;

public class A {
    /**
     * HashSet底层原理：
     *  HashSet集合底层采取哈希表存储数据
     *  哈希表是一种对于增删改查数据性能都较好的结构
     *
     * 哈希表组成：
     *  JDK8之前：数组+链表
     *  JDK8开始：数组+链表+红黑树
     *
     * 哈希值：对象的整数表现形式
     *  根据hashCode方法算出来的int类型的整数
     *  该方法定义在Object类中，所有对象都可以调用，默认使用地址值进行计算
     *  一般情况下，会重写hashCode方法，利用对象内部的属性值计算哈希值
     *
     * 对象的哈希值特点：
     *  1. 如果没有重写hashCode方法，不同对象计算出的哈希值是不同的
     *  2. 如果已经重写hashCode方法，不同的对象只要属性值相同，计算出的哈希值就是一样的
     *  3. 在小部分情况下，不同的属性值或者不同的地址值计算出来的哈希值也有可能一样(哈希碰撞，很小的概率会发生)
     */
    public static void main(String[] args) {
        // 创建学生对象
        Student s1 = new Student("张三", 23);
        Student s2 = new Student("张三", 23);

        // 没有重写hashCode方法
        // System.out.println(s1.hashCode()); // 41359092
        // System.out.println(s2.hashCode()); // 149928006

        // 重写hashCode方法
        System.out.println(s1.hashCode()); // 24022543
        System.out.println(s2.hashCode()); // 24022543

        // 哈希碰撞
        System.out.println("abc".hashCode()); // 96354
        System.out.println("acD".hashCode()); // 96354
    }
}
