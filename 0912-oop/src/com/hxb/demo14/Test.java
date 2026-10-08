package com.hxb.demo14;

public class Test {
    static void main() {
        /**
         * 继承的特点：
         *  1. java只支持单继承，不支持多继承，但支持多层继承
         *  2. 直接父类和间接父类
         *  3. 顶级父类：Object类，不写extends，默认所有类都直接或间接继承自Object类
         *
         * 继承中成员变量的书写规则：抽取共性
         *
         * 继承中成员变量访问特点：就近原则
         *  先在局部位置找，再在本类成员位置找，最后在父类成员位置找，逐级向上找
         *
         * super：父类的引用，用于访问父类的成员变量和方法
         * this：当前类的引用，用于访问当前类的成员变量和方法
         *
         * 如果出现了重名的成员变量
         *  name.sout
         *  this.name.sout
         *  super.name.sout
         */

        Zi zi = new Zi();
        zi.ziShow();
    }
}
