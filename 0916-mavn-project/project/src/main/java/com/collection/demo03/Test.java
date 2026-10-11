package com.collection.demo03;

import java.util.ArrayList;
import java.util.Collection;

public class Test {
    /**
     * 增强for遍历：
     *  增强for的底层就是迭代器，为了简化迭代器的代码书写的
     *  它是JDK5之后出现的，其内部原理就是一个Iterator迭代器
     *  所有的单列集合和数组才能用增强for进行遍历
     *  格式：
     *      for(元素的数据类型 元素的变量名:数组或者集合){
     *          // 操作
     *      }
     *  例如：
     *      for(String s : list){
     *          System.out.println(s);
     *      }
     *  快速生成方式：
     *      集合的名字.for + 回车
     *
     * 增强for的细节：
     *  修改增强for中的第三方变量，不会改变集合中原本的数据
     */
    public static void main(String[] args) {
        test01();
    }

    public static void test01(){
        // 创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("张三");
        coll.add("李四");
        coll.add("王五");

        // 利用增强for进行遍历
        // s其实就是一个第三方变量，在循环过程中依次表示集合中的每一个元素
        for (String s : coll){
            // 不会改变集合中的数据
            s = "qqq";
            System.out.println(s);
        }

        System.out.println(coll);
    }
}
