package com.hxb.demo31;

import com.hxb.demo30.Outer;

public class Test {
    static void main() {
        /**
         * 匿名内部类：
         *  就是一个没有名字的内部类，可以写在成员位置，也可以写在局部位置
         *  作用：在继承一个类或者实现一个接口的时候少写一个文件，也是lambda的前置知识点
         *  定义格式：
         *      new 类名或者接口名() {
         *          重写方法;
         *      };
         *  范例：
         *      new Inter() {
         *          public void show() {...}
         *      };
         */

        // 要求：在测试类中调用下面的goSwim方法

        // 传统方式调用goSwim方法：
        //  1. 新建java文件，在文件中新建Student类（实现Swim接口，重写swim方法）
        //  2. 创建Student类的对象
        Student s = new Student();
        //  3. 调用goSwim方法，传递Student类的对象作为参数
        goSwim(s);

        /**
         * 问题：
         *  如果Student类我只要用到一次，那么这个java文件单独新建有点浪费
         *  我是否可以不新建这个java文件，只要里面的代码呢？
         *
         * 匿名内部类的作用：少定义一个java文件
         *  定义格式：
         *      new 类名/接口名() {
         *          重写类/接口中的方法;
         *      };
         * 匿名内部类的定义格式 = 没有名字的java类 + 继承/实现 + 重写方法 + 创建对象
         * 最终格式可以理解：是一个没有名字的java类的对象，本质就是一个对象
         */

        goSwim(new Swim() {
            @Override
            public void swim() {
                System.out.println("学生在游泳");
            }

            @Override
            public void eat() {
                System.out.println("学生在吃");
            }

            @Override
            public void sleep() {
                System.out.println("学生在睡觉");
            }
        });

        // 多态
        // 相当于Swim ss = new Student();
        Swim ss = new Swim() {
            @Override
            public void swim() {
                System.out.println("学生在游泳");
            }

            @Override
            public void eat() {
                System.out.println("学生在吃");
            }

            @Override
            public void sleep() {
                System.out.println("学生在睡觉");
            }
        };
        ss.swim();

        /**
         * 没有名字的java类：大括号
         * Swim：就是这个没有名字的java类实现了Swim接口
         * 重写方法：我们要在大括号当中重写Swim所有的抽象方法
         * 创建对象：new关键字作用的是后面这个没有名字的java类，相当于创建了他的对象
         *
         * 整体：创建了一个Swim实现类的对象，只不过这个类没有名字而已
         */
    }

    // 调用这个方法的时候，需要传递Swim接口的实现类对象
    public static void goSwim(Swim s) {
        s.swim();
    }
}
