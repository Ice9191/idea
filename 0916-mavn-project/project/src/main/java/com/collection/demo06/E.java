package com.collection.demo06;

import java.util.ArrayList;

public class E {
    /**
     * 需求：定义一个方法，形参是一个集合，但是集合中的数据类型不确定
     */
    public static void main(String[] args) {
        // 创建集合的对象
        ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Fu> list2 = new ArrayList<>();
        ArrayList<Zi> list3 = new ArrayList<>();
        ArrayList<Teacher> list4 = new ArrayList<>();

        // test01(list1);
        // test01(list2);
        // test01(list3);
        // test01(list4);

        test02(list1);
        test02(list2);
        test02(list3);
        // Teacher不在Ye的子类范围之内，所以不能接收
        // test02(list4);

        test03(list1);
        test03(list2);
        // Zi、Teacher不在Fu的父类范围之内，所以不能接收
        // test03(list3);
        // test03(list4);
    }

    /**
     * 弊端：利用泛型方法有一个小弊端，此时它可以接收任意的数据类型
     * 希望：本方法虽然不确定类型，但是我希望它只能够接收Ye、Fu、Zi，不希望接收其他的数据类型
     * @param list
     * @param <E>
     */
    public static <E> void test01(ArrayList<E> list){

    }

    /**
     * 解决方案：使用泛型的通配符？
     *  ？：也表示不确定的类型，它可以进行类型的限定
     *      ? extends E：表示可以传递E或者E所有的子类类型
     *      ? super E：表示可以传递E或者E所有的父类类型
     *
     * 应用场景：
     *  1. 如果我们在定义类、方法、接口的时候，如果类型不确定，就可以定义泛型类、泛型方法、泛型接口
     *  2. 如果类型不确定，但是能知道以后只能传递某个继承体系中的，就可以使用泛型的通配符？
     *
     * 泛型的通配符：
     *  关键点：可以限定类型的范围
     * @param list
     */
    public static void test02(ArrayList<? extends Ye> list){

    }

    public static void test03(ArrayList<? super Fu> list){

    }
}

class Teacher{}