package com.collection.demo06;

import java.util.ArrayList;

public class B {
    /**
     * 泛型方法：
     *  方法中形参类型不确定时：
     *      1. 可以使用类名后面定义的泛型<E>(所有方法都可以使用这个泛型)
     *      2. 也可以在方法申明上定义自己的泛型(只能在本方法中才能使用这个泛型)
     *  格式：
     *      修饰符 <类型> 返回值类型 方法名(类型 变量名) {
     *          ...
     *      }
     *  举例：
     *      // 此处T可以理解为变量，但是不是用来记录数据的，而是记录类型的，可以写成：T、E、K、V等
     *      public <T> void show(T e) {
     *          ...
     *      }
     */
    public static void main(String[] args) {
        ArrayList<String > list = new ArrayList<>();
        ListUtil.addAll(list, "a", "b", "c", "d");
        System.out.println(list);

        ArrayList<Integer> l = new ArrayList<>();
        ListUtil.addAll(l, 1, 2, 3, 4);
        System.out.println(l);
    }
}
