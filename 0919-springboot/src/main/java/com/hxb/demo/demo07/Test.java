package com.hxb.demo.demo07;

import java.util.ArrayList;

public class Test {
    /**
     * 体验Stream流的作用
     *  需求：按照下面的要求完成集合的创建和遍历
     *      创建一个集合，存储多个字符串元素
     *      ArrayList<String> list = new ArrayList<>();
     *      list.add("张无忌");
     *      list.add("周芷若");
     *      list.add("赵敏");
     *      list.add("张强");
     *      list.add("张三丰");
     *  要求：
     *      1. 把所有以“张”开头的元素存储到新集合中
     *      2. 把“张”开头的，长度为3的元素再存储到新集合中
     *      3. 遍历打印最终结果
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        ArrayList<String> res1 = test01(list);
        ArrayList<String> res2 = test02(res1);
        test03(res2);
        System.out.println("-------------------------");
        test04(list);
    }

    /**
     * 使用Stream流更方便
     * @param list
     */
    public static void test04(ArrayList<String> list){
        list.stream().filter(name->name.startsWith("张")).filter(name->name.length() == 3).forEach(name-> System.out.println(name));
    }

    /**
     * 把所有以“张”开头的元素存储到新集合中
     * @param list
     */
    public static ArrayList<String> test01(ArrayList<String> list){
        ArrayList<String> names = new ArrayList<>();
        for (String name : list) {
            if(name.startsWith("张")){
                names.add(name);
            }
        }
        return names;
    }

    /**
     * 把“张”开头的，长度为3的元素再存储到新集合中
     * @param list
     */
    public static ArrayList<String> test02(ArrayList<String> list){
        ArrayList<String> names = new ArrayList<>();
        for (String name : list) {
            if(name.length() == 3){
                names.add(name);
            }
        }
        return names;
    }

    /**
     * 遍历打印最终结果
     * @param list
     */
    public static void test03(ArrayList<String> list){
        for (String name : list) {
            System.out.println(name);
        }
    }
}
