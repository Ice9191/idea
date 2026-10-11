package com.collection.demo02;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test {
    /**
     * Collection的遍历方式：
     *  迭代器遍历
     *  增强for遍历
     *  Lambda表达式遍历
     *
     * 迭代器遍历：迭代器在java中的类是Iterator，迭代器是集合专用的遍历方式，不依赖索引
     *  Collection集合获取迭代器：
     *      Iterator<E> iterator()：返回迭代器对象，默认指向当前集合的0索引
     *  Iterator中的常用方法：
     *      boolean hasNext()：判断当前位置是否有元素，有元素返回true，没有元素返回false
     *      E next()：获取当前位置的元素，并将迭代器对象移向下一个位置
     *
     * 细节注意点：
     *  1. 当hasNext()方法返回false时，如果再次调用next()方法就会抛出NoSuchElementException异常
     *  2. 迭代器遍历完毕后，指针是不会复位的，如果需要重新遍历，需要重新获取迭代器对象
     *  3. 循环中只能用一次next()方法
     *  4. 迭代器遍历时，不能用集合的方法进行增加或删除元素
     */
    public static void main(String[] args) {
        // test01();
        // test02();
        // test03();
        test04();
    }

    public static void test01(){
        // 创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        // 获取迭代器对象
        // 迭代器就好比是一个箭头，默认指向集合的0索引处
        Iterator<String> iterator = coll.iterator();

        // 利用循环不断的去获取集合中的每一个元素
        while (iterator.hasNext()){
            // next()方法做的两件事情：获取元素和移动指针
            String str = iterator.next();
            System.out.println(str);
        }
    }

    public static void test02(){
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        Iterator<String> iterator = coll.iterator();

        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }

        // 当上面循环结束之后，迭代器的指针已经指向了最后没有元素的位置
        // System.out.println(iterator.next()); // NoSuchElementExpection

        // 迭代器遍历完毕，指针不会复位
        System.out.println(iterator.hasNext());
        System.out.println(iterator.hasNext());

        // 如果我们要继续第二次遍历集合，只能再次获取一个新的迭代器对象
        Iterator<String> it = coll.iterator();
        while (it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }
    }

    public static void test03(){
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");
        coll.add("eee");

        Iterator<String> iterator = coll.iterator();

        while (iterator.hasNext()){
            // 指针一次性移动两次，最好还是需要一个变量接收next()的返回值
            System.out.println(iterator.next());
            System.out.println(iterator.next());
        }
    }

    public static void test04(){
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");
        coll.add("eee");

        Iterator<String> iterator = coll.iterator();

        // 使用集合方法删除元素
        while (iterator.hasNext()){
            String str = iterator.next();
            if("bbb".equals(str)){
                // 不能用集合的方法进行删除，要使用迭代器的方法进行删除
                // coll.remove("bbb");
                iterator.remove();
            }
        }

        System.out.println(coll); // ConcurrentModificationException异常
    }
}
