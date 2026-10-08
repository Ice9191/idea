package com.hxb.demo30;

public class Outer {
    int a = 1;
    int b = 2;

    public void show() {
        // 局部变量
        // 能修饰局部变量的都能用来修饰局部内部类
        // public、private、protected、默认只能修饰成员，不能修饰局部变量
        // public int a = 10;
        int a = 10;

        // 局部内部类
        class Inner {
            String name;
            int age;

            public void method1() {
                System.out.println(a);
                System.out.println(b);
                System.out.println("局部内部类中的方法method1");
            }

            public static void method2() {
                System.out.println("局部内部类中的静态方法method2");
            }
        }

        // 创建局部内部类的对象
        Inner i = new Inner();
        System.out.println(i.name);
        System.out.println(i.age);
        i.method1();
        Inner.method2();
    }
}
