package com.collection.demo06;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    /**
     * 泛型深入理解：
     *  泛型：是JDK5中引入的特性，可以在编译阶段约束操作的数据类型，并进行检查
     *  泛型的格式：<数据类型>
     *  注意：泛型只能支持引用数据类型
     *
     * 泛型的好处：
     *  统一数据类型
     *  把运行时期的问题提前到了编译时期，避免了强制类型转换可能出现的异常，因为在编译阶段类型就能确定下来
     *
     * 扩展知识点：java中的泛型是伪泛型，因为泛型在编译阶段，即.java文件被编译成.class文件的阶段，此时会进行类型擦除，把泛型类型替换为Object类型，当获取数据的时候，会进行强制类型转换，再次转换成指定类型
     *
     * 泛型的细节：
     *  1. 泛型中不能写基本数据类型
     *  2. 指定泛型的具体类型后，传递数据时，可以传入该类类型或者其子类类型
     *  3. 如果不写泛型，类型默认是Object
     */
    public static void main(String[] args) {
        // test01();
        test02();
    }

    public static void test02(){
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str.length());
            System.out.println(str);
        }
        System.out.println(list);
    }

    /**
     * 没有泛型的时候，集合如何存储数据？
     * 结论：
     *  如果我们没有给集合指定类型，默认认为所有的数据类型都是Object类型，此时可以往集合里面添加任意的数据类型
     *  会带来一个坏处：我们在获取数据的时候，无法使用它的特有行为
     *
     * 此时推出了泛型，可以在添加数据的时候就把类型进行统一
     * 而且我们在获取数据的时候，也省的强转了，非常的方便
     */
    public static void test01(){
        // 创建集合的对象
        ArrayList list = new ArrayList();

        // 添加数据
        list.add(123); // Integer
        list.add("aaa"); // String
        list.add(new Student("张三", 18)); // Student

        // 遍历集合获取里面的每一个元素
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            // 这里强制类型转换，会导致类型转换异常报错，不知道到底要转换成什么类型
            // String obj = (String) iterator.next();
            Object obj = iterator.next();
            // 多态的弊端是不能访问子类的特有方法
            // obj.length();
            System.out.println(obj);
        }
    }
}
