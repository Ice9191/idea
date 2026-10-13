package com.collection.demo07;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        test(list);
    }

    public static void test(ArrayList<String> list){
        ArrayList<String> l = new ArrayList<>(list);
        System.out.println(l);
        System.out.println("修改测试");
    }
}
