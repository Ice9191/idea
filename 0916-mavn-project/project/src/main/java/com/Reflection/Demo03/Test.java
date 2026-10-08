package com.Reflection.Demo03;

public class Test {
    /**
     * 反射允许对封装类的字段，方法和构造函数的信息进行编程访问
     *  字段：类中的成员变量
     *  方法：类中的成员方法
     *  构造函数：类中的构造方法
     *
     * 反射就是获取成员变量、成员方法、构造方法，并解剖得到对应的全部信息（类型、名称、参数列表、返回值类型等）
     *  分为：获取和解剖
     *
     * 如何获取？
     *  不是从java文件当中获取的，而是从class文件当中获取的，所以要先知道如何获取class字节码文件的对象，再去学习如何从字节码文件里面去获取字段、方法、构造函数
     */

    public static void main(String[] args) {

        // Class.forName方法（最为常用）
        // 全类名：包名 + 类名 com.Reflection.Demo03.Cls
        Class<?> clazz;
        try {
            clazz = Class.forName("com.Reflection.Demo03.Cls");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        // 类名.class方法（一般更多的是当作参数进行传递）
        Class<Cls> clsClass = Cls.class;

        // 对象.getClass()方法（当我们已经有了这个类的对象时，就可以使用）
        Cls cls = new Cls();
        Class<? extends Cls> aClass = cls.getClass();

        System.out.println(clazz == clsClass);
        System.out.println(aClass == clsClass);
    }
}
