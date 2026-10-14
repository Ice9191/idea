package com.collection.demo06;

import java.util.ArrayList;

public class D {
    /**
     * 泛型的继承和通配符：
     *  泛型不具备继承性，但是数据具备继承性
     */
    public static void main(String[] args) {
        // 创建集合的对象
        ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Fu> list2 = new ArrayList<>();
        ArrayList<Zi> list3 = new ArrayList<>();

        // 调用test01方法
        test01(list1);
        // 泛型不具备继承性
        // test01(list2);
        // test01(list3);

        // 数据具备继承性
        list1.add(new Ye());
        list1.add(new Fu());
        list1.add(new Zi());
    }

    /**
     * 此时，泛型里面写的是什么类型，那么只能传递什么类型的数据
     * @param list
     */
    public static void test01(ArrayList<Ye> list){

    }
}

class Ye{}
class Fu extends Ye{}
class Zi extends Fu{}
