package com.Reflection.Demo02;

import java.util.Arrays;

public class Test {
    /**
     * Class 对象，简单说就是：JVM 在加载某个类型时，为这个类型创建的一个“运行时代表对象”。它的类型是 java.lang.Class。
     * Class 对象的核心作用是：在运行时表示一个类型，并作为 Java 反射机制的入口。
     * 它让你能在程序运行期间获取类型信息、创建对象、调用方法、判断类型、处理注解，支撑各种框架底层。
     *
     * 当你定义一个类时，比如Sun这个类，那么JVM就会加载这个Sun类，会做两件事：
     *  1. 在方法区（Java 8+ 是元空间）保存 Sun 的元数据：类名、父类、字段、方法、构造器等。
     *  2. 在堆中创建一个 Class 对象，代表 Sun 这个类型。这个对象就是Sun.class，而它的类型是Class<Sun>。
     *  通过Class<Sun> clazz = Sun.class;来获取这个Class对象。
     *
     * Class 对象的具体作用：
     *  1. 表示运行时的类型
     *      每个类、接口、数组、基本类型被 JVM 加载后，都会生成一个对应的 Class 对象。
     *  2. 作为反射的入口
     *      通过 Class 对象可以获取类的所有结构信息
     *  3. 动态创建对象
     *  ....
     */
    public static void main(String[] args) {

        IShow lambda = () -> {
            System.out.println("Lambda show()方法被调用");
        };
        lambda.show();

        // 1. 类的Class对象
        // 获取Sun类的Class对象
        // 作用：获取类的信息
        Class<Sun> clazz = Sun.class;
        System.out.println(clazz.getName()); // 获取全限定类名
        System.out.println(clazz.getSuperclass()); // 获取父类的Class对象
        System.out.println(Arrays.toString(clazz.getInterfaces())); // 获取实现的接口
        System.out.println(Arrays.toString(clazz.getDeclaredMethods())); // 获取所有方法，包括私有方法

        System.out.println("-----------------");

        // 2. 接口的Class对象
        Class<IShow> iShowClass = IShow.class;
        System.out.println(iShowClass.isInterface()); // true
    }
}

class Sun implements IShow{
    private String name;

    public Sun(){}

    public Sun(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println(name + "正在吃");
    }

    @Override
    public void show() {
        System.out.println("重写show方法被调用");
    }
}

@FunctionalInterface
interface IShow {
    void show();
}