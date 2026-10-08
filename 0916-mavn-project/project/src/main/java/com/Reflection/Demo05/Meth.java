package com.Reflection.Demo05;

import org.springframework.aop.target.EmptyTargetSource;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Meth {
    /**
     * 利用反射获取成员方法
     *  Class类中用于获取成员方法的方法
     *      1. Method[] getMethods()：返回所有public成员方法对象的数组，包括继承的
     *      2. Method[] getDeclaredMethods()：返回所有成员方法对象的数组，不包括继承的
     *      3. Method getMethod(String name, Class<?>... parameterTypes)：返回单个public成员方法对象
     *      4. Method getDeclaredMethod(String name, Class<?>... parameterTypes)：返回单个成员方法对象
     *  Method类中用于创建对象的方法
     *      1. Object invoke(Object obj, Object... args)：运行方法
     *      参数一：用obj对象调用该方法
     *      参数二：调用方法的传递的参数（如果没有就不写）
     *      返回值：方法的返回值（如果没有就不写）
     */

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        // 获取class字节码文件对象
        Class<?> clazz = Class.forName("com.Reflection.Demo05.Student");

        // 获取所有public成员方法对象的数组（包含父类中所有的public方法）
        Method[] ms = clazz.getMethods();
        for (Method m : ms) {
            System.out.println(m);
        }

        System.out.println("-----------------");

        // 获取所有成员方法对象的数组（不包括继承的，但是可以获取到private方法）
        Method[] dms = clazz.getDeclaredMethods();
        for (Method dm : dms) {
            System.out.println(dm);
        }

        System.out.println("-----------------");

        // 获取单个成员方法对象
        // 参数一：方法的名字
        // 参数二：对应方法的形参的Class对象（为了方法的重载）
        Method eMeth = clazz.getDeclaredMethod("eat", String.class, int.class);
        System.out.println(eMeth);

        System.out.println("-----------------");

        // 获取方法的修饰符
        int modifier = eMeth.getModifiers();
        System.out.println(modifier);

        System.out.println("-----------------");

        // 获取方法的名字
        String name = eMeth.getName();
        System.out.println(name);

        System.out.println("-----------------");

        // 获取方法的形参
        Parameter[] parameters = eMeth.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }

        System.out.println("-----------------");

        // 获取方法抛出的异常
        Class<?>[] exceptionTypes = eMeth.getExceptionTypes();
        for (Class<?> exceptionType : exceptionTypes) {
            System.out.println(exceptionType);
        }

        System.out.println("-----------------");

        // 方法的运行
        // 获取调用则
        // 当前方法是private方法，所以需要调用setAccessible(true)方法，设置为可访问
        Student student = new Student("张三", 18);
        eMeth.setAccessible(true);
        // 获取方法的返回值
        String result = (String) eMeth.invoke(student, "鱼香肉丝", 2);
        System.out.println(result);
    }
}
