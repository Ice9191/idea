package com.hxb.demo13;

public class Test {
    /**
     * 继承：类与类之间的一种父子关系，java中提供关键字extends，用于建立类与类之间的关系
     * 子类，也叫派生类；父类，也叫基类/超类
     * 继承的作用：
     *  操作：多个子类中重复的代码抽取到父类中，子类可以直接使用
     *  好处：减少代码冗余，提高代码复用性
     * 继承的格式：
     *  public class 子类名 extends 父类名{}
     * 继承后子类的好处：
     *  1. 子类可以得到父类的属性和方法，子类可以使用
     *  2. 子类可以在父类的基础上新增其他功能，子类更强大
     */

    static void main() {

        Student s = new Student();
        s.name = "张三";
        s.age = 18;
        s.grade = "高一";

        System.out.println(s.name +", "+ s.age +", "+ s.grade);

        s.eat();
        s.study();

        System.out.println("-----------------");

        Teacher t = new Teacher();
        t.name = "李四";
        t.age = 30;
        t.subject = "数学";

        System.out.println(t.name +", "+ t.age +", "+ t.subject);

        t.eat();
        t.teach();
    }
}
