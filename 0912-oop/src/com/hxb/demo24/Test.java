package com.hxb.demo24;

public class Test {
    static void main() {
        /**
         * 接口：接口就是一个规则，而且是独立于继承体系以外的规则。（可以理解为干爹）
         * 格式：关键字interface来定义 public interface 接口名 {...}
         * 使用：接口和类之间的是实现关系，通过implements关键字表示 public class 类名 implements 接口名 {...}
         * 接口的注意事项：
         *  1. 接口不能实例化（就是不能创建对象）
         *  2. 接口的子类，也叫实现类，要么重写接口中所有的抽象方法（经常），要么实现类是一个抽象类
         *  3. 一个类可以实现多个接口，用逗号隔开，也可以在继承一个类的同时，实现多个接口
         *      public class 类名 implements 接口名1,接口名2 {...}
         *      public class 类名 extends 父类 implements 接口名1,接口名2 {...}
         */

        // 创建一个狗对象
        Dog d = new Dog("旺财", "黄色");
        System.out.println(d.getName() + ", " + d.getColor());
        d.eat();
        d.swim();
    }
}
