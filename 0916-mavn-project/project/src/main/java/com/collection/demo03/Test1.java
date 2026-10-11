package com.collection.demo03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class Test1 {
    /**
     * Lambda表达式遍历：得益于JDK8开始的新技术Lambda表达式，提供了一种更简单、更直接的遍历集合的方式
     * 方法：default void forEach(Consumer<? super T> action)：结合Lambda遍历集合
     */
    public static void main(String[] args) {
        // test01();
        test02();
    }

    public static void test02() {
        // 创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("张三");
        coll.add("李四");
        coll.add("王五");

        // 利用Lambda表达式的形式
        // () -> {} 小括号里面写参数，-> 箭头后面写方法体
        coll.forEach((String s) -> {
            // s依次表示集合中的每一个数据
            System.out.println(s);
        });

        // 可以简写为
        coll.forEach(s -> System.out.println(s));
    }

    public static void test01() {
        // 创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("张三");
        coll.add("李四");
        coll.add("王五");

        // 利用匿名内部类的形式
        // 底层原理：其实也会自己遍历集合，依次得到每一个元素，把得到的每一个元素传递给下面的accept方法
        coll.forEach(new Consumer<String>() {
            @Override
            // s依次表示集合中的每一个数据
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
