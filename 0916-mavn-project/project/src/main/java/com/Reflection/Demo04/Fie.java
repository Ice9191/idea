package com.Reflection.Demo04;

import java.lang.reflect.Field;

public class Fie {
    /**
     * 利用反射获取成员变量
     *  Class类中用于获取成员变量的方法
     *      1. Field[] getFields()：返回所有public成员变量对象的数组
     *      2. Field[] getDeclaredFields()：返回所有成员变量对象的数组（包括private）
     *      3. Field getField(String name)：返回单个public成员变量对象
     *      4. Field getDeclaredField(String name)：返回单个成员变量对象（包括private）
     *  Field类中用于创建对象的方法
     *      1. void set(Obejct obj, Object value)：赋值
     *      2. Object get(Object obj)：获取值
     */

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {

        // 获取class文件字节码的对象
        // 不管是构造还是成员变量还是成员方法，都是在class字节码文件里面的，所以先要获取大的对象，才能获取里面的信息
        Class<?> clazz = Class.forName("com.Reflection.Demo04.Student");

        // 获取public成员变量
        Field[] fs = clazz.getFields();
        for (Field f : fs) {
            System.out.println(f);
        }

        System.out.println("-----------------");

        // 获取所有成员变量
        Field[] dfs = clazz.getDeclaredFields();
        for (Field df : dfs) {
            System.out.println(df);
        }

        System.out.println("-----------------");

        // 获取单个public成员变量
        Field gf = clazz.getField("gender");
        System.out.println(gf);

        System.out.println("-----------------");

        // 获取单个成员变量
        Field dgf = clazz.getDeclaredField("age");
        System.out.println(dgf);

        System.out.println("-----------------");

        // 获取权限修饰符
        int m = dgf.getModifiers();
        System.out.println(m);

        System.out.println("-----------------");

        // 获取成员变量名
        String name = dgf.getName();
        System.out.println(name);

        System.out.println("-----------------");

        // 获取数据类型
        Class<?> type = dgf.getType();
        System.out.println(type);

        System.out.println("-----------------");

        // 获取成员变量记录的值
        Student s = new Student("张三", 18, "男");
        // 需要临时取消访问权限
        dgf.setAccessible(true);
        int o = (int)dgf.get(s);
        System.out.println(o);

        System.out.println("-----------------");

        // 修改对象里面记录的值
        dgf.set(s, 20);
        System.out.println(s);
    }
}
