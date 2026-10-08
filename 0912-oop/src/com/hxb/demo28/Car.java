package com.hxb.demo28;

public class Car {
    String carBrand;
    int carPrice;
    String carColor;

    /**
     * 成员内部类：
     *  写在成员位置的，属于外部类的成员之一
     *  成员内部类可以被一些修饰符所修饰，比如public、private、protected、默认、static等
     *
     * 编写成员内部类的注意点：
     *  1. 成员内部类可以被一些修饰符所修饰，比如public、private、protected、默认、static等
     *  2. 在成员内部类里面，JDK16之前不能定义静态变量，JDK16开始才可以定义静态变量
     * 获取成员内部类对象的两种方式：
     *  1. 外部类编写方法，对外提供内部类对象(当成员内部类被private修饰时)
     *  2. 直接创建成员内部类的对象(当成员内部类没有被private修饰时)
     *  格式：外部类名.内部类名 对象名 = 外部类对象.内部类对象;
     *  范例：Car.Engine inner = new Car().new Engine();
     */
    class Engine{
        String engineBrand;
        int enginePrice;
        String engineColor;
    }
}
