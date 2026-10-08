package com.Reflection.Demo03;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

public class Constru {
    /**
     * 在java当中，万物皆对象
     *  字节码文件：可以当作是Class类的对象
     *  构造方法：可以当作是Constructor类的对象
     *  字段（成员变量）：可以当作是Field类的对象
     *  成员方法：可以当作是Method类的对象
     *
     * 利用反射获取构造方法
     *  Class类中用于获取构造方法的方法：
     *      1. Constructor<?>[] getConstructors()：返回所有public构造方法对象的数组
     *      // Declared：就是可以获取全部public、private等的构造方法
     *      2. Constructor<?>[] getDeclaredConstructors()：返回所有构造方法对象的数组
     *      3. Constructor<T> getConstructor(Class<?>... parameterTypes)：返回单个公共构造方法对象
     *      4. Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)：返回单个构造方法对象
     *  Constructor类中用于创建对象的方法：
     *      1. T newInstance(Object... initargs)：根据指定的构造方法创建对象
     *      2. setAccessible(boolean flag)：设置为true，表示取消访问检查
     */

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {

        // 获取class字节码文件的对象
        Class<?> clazz;
        try {
            clazz = Class.forName("com.Reflection.Demo03.Student");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        // 获取所有public构造方法
        Constructor<?>[] cons = clazz.getConstructors();
        for (Constructor<?> con : cons) {
            System.out.println(con);
        }

        System.out.println("-----------------");

        // 获取所有构造方法
        Constructor<?>[] dCons = clazz.getDeclaredConstructors();
        for (Constructor<?> con : dCons) {
            System.out.println(con);
        }

        System.out.println("-----------------");

        // 获取指定的构造方法
        Constructor<?> empCons;
        try {
            empCons = clazz.getDeclaredConstructor();
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        System.out.println(empCons);
        Constructor<?> clsCons;
        try {
            clsCons = clazz.getDeclaredConstructor(String.class);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        System.out.println(clsCons);
        Constructor<?> strIntCons;
        try {
            strIntCons = clazz.getDeclaredConstructor(String.class, int.class);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        System.out.println(strIntCons);

        System.out.println("-----------------");

        // 获取权限修饰符
        // public：1
        // private：2
        // protected：4
        int modifiers = empCons.getModifiers();
        System.out.println(modifiers);

        // 获取参数列表
        Parameter[] parameters = strIntCons.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }

        System.out.println("-----------------");

        // 用构造方法创建对象（Declared只能让你看到private的构造方法，但是无法让你用来创建对象）
        // 如果想要创建对象，就需要调用setAccessible(true)方法，取消访问检查
        // 暴力反射：表示临时取消权限校验
        strIntCons.setAccessible(true);
        Student stu = (Student) strIntCons.newInstance("张三", 18);
        System.out.println(stu);
    }
}
