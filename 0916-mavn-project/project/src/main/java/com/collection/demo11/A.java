package com.collection.demo11;

import java.util.TreeSet;

public class A {
    /**
     * TreeSet集合默认的规则：
     *  对于数值类型：Integer、Double，默认按照从小到大的顺序进行排序
     *  对于字符、字符串类型：按照字符在ASCII码表中的数字升序进行排序
     *
     * TreeSet的两种比较方式：
     *  1. 默认排序/自然排序：javabean类实现Comparable接口指定比较规则
     *  2. 比较器排序：创建TreeSet对象时，传递比较器Comparator指定规则
     *  使用原则：默认使用第一种，如果第一种不能满足当前需求，就使用第二种
     */

    /**
     * TreeSet对象排序练习题：
     *  需求：创建TreeSet集合，并添加3个学生对象
     *  学生对象属性：姓名、年龄
     *  要求按照学生的年龄进行排序
     *  同年龄按照姓名字母排列(暂时不考虑中文)
     *  同姓名、同年龄认为是同一个人
     */
    public static void main(String[] args) {
        test01();
    }

    public static void test01(){
        // 创建3个学生对象
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);
        Student s4 = new Student("zhaoliu", 26);

        // 创建集合对象
        TreeSet<Student> ts = new TreeSet<>();

        // 添加元素
        ts.add(s3);
        ts.add(s1);
        ts.add(s2);
        ts.add(s4);

        // 打印集合
        System.out.println(ts);
    }
}
