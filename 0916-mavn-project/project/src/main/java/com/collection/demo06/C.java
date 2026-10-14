package com.collection.demo06;

public class C {
    /**
     * 泛型接口：
     *  格式：
     *      修饰符 interface 接口名<类型> {
     *          ...
     *      }
     *  举例：
     *      public interface List<E> {
     *          ...
     *      }
     *  重点：如何使用一个带泛型的接口
     *  两种使用方式：
     *      1. 实现类给出具体的类型
     *      2. 实现类延续泛型，创建对象时再确定
     */
    public static void main(String[] args) {
        // 此时NewArrayList类确定了类型为String，所以不需要再写<String>
        NewArrayList lis = new NewArrayList();
        lis.add("aaa");

        // 此时NewArrayList2类延续了泛型，所以需要写<String>
        NewArrayList2<String> lis2 = new NewArrayList2<>();
        lis2.add("aaa");
    }
}
