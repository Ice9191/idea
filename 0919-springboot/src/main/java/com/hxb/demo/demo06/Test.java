package com.hxb.demo.demo06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {
    /**
     * ::方法引用，在JDK1.8版本后与Lambda表达式配套使用的
     *  方法引用是用来直接访问类或者实例的已经存在的方法或者构造方法。
     *  方法引用提供了一种引用而不执行方法的方式，它需要由兼容的函数式接口构成的目标类型上下文。
     *  计算时，方法引用会创建函数式接口的一个实例。
     *  当Lambda表达式中只是执行一个方法调用时，不用Lambda表达式，直接通过方法引用的形式可读性更高一些。
     *  方法引用是一种更简洁易懂的Lambda表达式。
     */
    public static void main(String[] args) {
        test01();
    }

    public static void test01(){
        List<Person> list = new ArrayList<>();
        list.add(new Person("Sam", 18));
        list.add(new Person("Lily", 23));
        list.add(new Person("Jack", 18));
        // 传统写法
        list.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Person.compare(o1, o2);
            }
        });
        // Lambda表达式
        list.sort(((o1, o2) -> Person.compare(o1, o2)));
        // 方法引用写法，调用static静态方法，参数类型动态推断
        // Comparator这个函数式接口，只有一个抽象方法compare，并且这个方法中只有两个参数，所以Person类调用的就会是只有两个形参的compare方法，而不是三个形参的，这里就进行了动态推断
        list.sort(Person::compare);
        System.out.println(list);
    }

    /**
     * 方法引用在Stream流中的应用
     */
    public static void test02(){
        List<Person> list = new ArrayList<>();
        list.add(new Person("Sam", 18));
        list.add(new Person("Lily", 23));
        list.add(new Person("Jack", 18));
        // list.stream().sorted(Person::compare).forEach(person -> System.out.println(person));
        list.stream().sorted(Person::compare).forEach(System.out::println);
    }
}
