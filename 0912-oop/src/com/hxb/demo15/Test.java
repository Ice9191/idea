package com.hxb.demo15;

public class Test {
    static void main() {
        /**
         * 继承中的成员方法的特点：
         *  1. 书写规则：把多个子类中共性的成员方法抽取到父类中
         *  2. 调用规则：遵守就近原则
         *
         * 方法的重写：在子类中，把父类的方法再写一遍，方法申明保持一致
         *  使用场景：如果父类的方法不能满足子类的需求，子类中可以把该方法再重写一遍
         *
         * 方法重写的注意事项和要求：
         *  1. 重写方法的名称、形参列表必须与父类中的一致，方法体可以不同
         *  2. 子类重写父类方法时，访问权限子类必须大于等于父类
         *  3. 子类重写父类方法时，返回值类型子类必须小于等于父类
         *  4. 重写的方法申明和父类保持一致即可
         *  5. final修饰类为最终类，里面的所有方法不能被重写
         *  6. private私有方法、static静态方法、final最终方法不能被重写
         */

        FirstPhone p1 = new FirstPhone();
        p1.call();

        System.out.println("-----------------");

        SecondPhone p2 = new SecondPhone();
        p2.call();
        p2.sendMessage();

        System.out.println("-----------------");

        ThirdPhone p3 = new ThirdPhone();
        p3.call();
        p3.sendMessage();
        p3.playGame();
    }
}
