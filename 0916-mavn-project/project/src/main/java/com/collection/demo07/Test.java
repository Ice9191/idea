package com.collection.demo07;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        ArrayList<PersianCat> list1 = new ArrayList<>();
        ArrayList<LiHuaCat> list2 = new ArrayList<>();
        ArrayList<TeddyDog> list3 = new ArrayList<>();
        ArrayList<HuskyDog> list4 = new ArrayList<>();

        list1.add(new PersianCat("Tom", 1));
        list2.add(new LiHuaCat("Jerry", 2));
        list3.add(new TeddyDog("Buddy", 3));
        list4.add(new HuskyDog("Max", 4));

        keepPet01(list1);
        keepPet01(list2);
        // 不能养狗
        // keepPet01(list3);
        // keepPet01(list4);

        System.out.println("-------------");

        // 不能养猫
        // keepPet02(list1);
        // keepPet02(list2);
        keepPet02(list3);
        keepPet02(list4);

        System.out.println("-------------");

        keepPet03(list1);
        keepPet03(list2);
        keepPet03(list3);
        keepPet03(list4);
    }

    /**
     * 要求1：该方法能养所有品种的猫，但是不能养狗
     * @param list
     */
    public static void keepPet01(ArrayList<? extends Cat> list){
        list.forEach(s -> s.eat());
    }

    /**
     * 要求2:该方法能养所有品种的狗，但是不能养猫
     * @param list
     */
    public static void keepPet02(ArrayList<? extends Dog> list){
        list.forEach(s -> s.eat());
    }

    /**
     * 要求3：该方法能养所有的动物，但是不能传递其他类型
     * @param list
     */
    public static void keepPet03(ArrayList<? extends Animal> list){
        list.forEach(s -> s.eat());
    }
}
