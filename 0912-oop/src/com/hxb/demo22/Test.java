package com.hxb.demo22;

public class Test {
    static void main() {
        /**
         * 抽象方法：将共性的方法抽取到父类之后。因为每一个子类的方法体是不一样的的，所以，在父类中不能确定具体的方法体。该方法就可以定义为抽象方法
         * 抽象类：如果一个类中存在抽象方法，那么该类就必须声明为抽象类
         *
         * 抽象方法的定义格式：public abstract 返回值类型 方法名(参数列表);
         * 抽象类的定义格式：public abstract class 类名{...}
         *
         * 抽象方法的好处：
         *  1. 让父类不再纠结方法体到底写什么
         *  2. 强制让子类必须要重写抽象方法，否则代码就会报错
         *  3. 强制子类必须按照这种格式进行重写
         */

        Cat c = new Cat("小白", "黄色");
        System.out.println(c.getName() + "是" + c.getColor() + "的猫");
        c.eat();
        c.catchMouse();
        c.drink();
    }
}
