package com.Reflection.Demo07;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        /**
         * 练习：跟配置文件结合动态创建
         *  反射可以跟配置文件结合的方式，动态的创建对象，并调用方法
         */

        // 1. 读取配置文件中的信息
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("0916-mavn-project/project/src/prop.properties");
        prop.load(fis);
        fis.close();
        System.out.println(prop);

        // 2. 获取全类名和方法名
        String classname = (String) prop.get("classname");
        String method = (String) prop.get("method");
        System.out.println(classname);
        System.out.println(method);

        // 3. 利用反射创建对象并运行方法
        Class<?> clazz = Class.forName(classname);// 参数需要传入全类名
        // 获取构造方法
        Constructor<?> con = clazz.getDeclaredConstructor();
        // 利用构造方法创建对象
        Object obj = con.newInstance();
        System.out.println(obj);

        // 4. 获取成员方法并运行
        Method dMethod = clazz.getDeclaredMethod(method);
        dMethod.setAccessible(true);
        dMethod.invoke(obj);

        // 如果想要运行Teacher类中的teach方法，只需要修改配置文件就可以了
    }
}
