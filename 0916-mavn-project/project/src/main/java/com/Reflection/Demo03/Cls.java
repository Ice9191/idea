package com.Reflection.Demo03;

public class Cls {
    /**
     * 获取class对象的三种方式
     *  1. Class.forName("全类名"); // Class这个类就是用来描述字节码文件的
     *  2. 类名.class
     *  3. 对象.getClass(); // 所有对象都可以调用getClass()方法
     *
     * 创建一个类的对象，是分以下3个阶段：
     *  1. 源代码阶段：先编写java文件，然后把它编译成class字节码文件，这个阶段没有把代码加载到内存当中，只是在硬盘进行的操作
     *      在这个阶段，会用Class.forName("全类名")来获取class对象
     *  2. 加载阶段：把类的字节码文件加载到内存当中
     *      在这个阶段，会用类名.class来获取class对象
     *  3. 运行阶段：在堆内存中创建了这个类的对象
     *      在这个阶段，会用对象.getClass();来获取class对象
     */

    private String name;
    private int age;

    public Cls(){}

    public Cls(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
