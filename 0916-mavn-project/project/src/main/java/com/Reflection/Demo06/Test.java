package com.Reflection.Demo06;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class Test {
    /**
     * 反射的作用：
     *  1. 获取一个类里面所有的信息，获取到了之后，再执行其他的业务逻辑
     *  2. 结合配置文件，动态的创建对象并调用方法
     */

    public static void main(String[] args) throws IllegalAccessException, IOException {

        // 练习：对于任意一个对象，都可以把对象所有的字段名和值，保存到文件中去
        Student student = new Student("张三", 18, '男', 1.8, "篮球");
        Teacher teacher = new Teacher("李四", 5000);

        saveObject(student);
        System.out.println("-----------------");
        // saveObject(teacher);
    }

    // 把对象里面所有的成员变量名和值保存到本地文件中去
    public static void saveObject(Object obj) throws IllegalAccessException, IOException {
        // 1. 获取字节码文件对象
        Class<?> clazz = obj.getClass();

        // 创建IO流
        BufferedWriter bw = new BufferedWriter(new FileWriter("0916-mavn-project/project/src/main/java/com/Reflection/Demo06/aaa.txt"));

        // 2. 获取所有的成员变量
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            // 不可用成员变量是否可以访问，先临时取消访问权限
            declaredField.setAccessible(true);
            // 获取成员变量名
            String fieldName = declaredField.getName();
            // 获取成员变量值
            Object declaredFieldValue = declaredField.get(obj);
            // 写出数据
            bw.write(fieldName + "=" + declaredFieldValue);
            bw.newLine();
        }
        bw.close();
    }
}
