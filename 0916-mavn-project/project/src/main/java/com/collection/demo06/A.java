package com.collection.demo06;

public class A {
    /**
     * 泛型可以在很多地方进行定义：
     *  1. 写在类后面，叫泛型类
     *  2. 写在方法上面，叫泛型方法
     *  3. 写在接口后面，叫泛型接口
     *
     * 泛型类：
     *  使用场景：当一个类中，某个变量的数据类型不确定时，就可以定义带有泛型的类
     *  格式：
     *      修饰符 class 类名<类型> {
     *          ...
     *      }
     *  举例：
     *      // 这里的E表示不确定的类型，ArrayList要存什么，我们也不知道
     *      // 当创建该类对象时，E就确定类型
     *      // 此处的E可以理解为变量，但是不是用来记录数据的，而是记录数据饿类型，可以写成：T、E、K、V随便等
     *      public class ArrayList<E> {
     *              ...
     *      }
     */
    public static void main(String[] args) {
        // test01();
        test02();
    }

    public static void test01(){
        // String传递给了E
        MyArrayList<String> list = new MyArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list);
    }

    public static void test02(){
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(111);
        list.add(222);
        list.add(333);
        System.out.println(list.get(0));
        System.out.println(list);
    }
}
