package com.hxb.demo28;

public class Outer {
    private int a = 10;

    class Inner {
        private int a = 20;

        public void show() {
            int a = 30;
            System.out.println(a); // 30
            System.out.println(this.a); // 20
            // 当外部类成员变量和内部类成员变量重名时，可以使用Outer.this.成员变量名来访问外部类的成员变量a
            System.out.println(Outer.this.a); // 10
        }
    }

    /**
     * Outer类和Test类的内存执行流程：
     * 1. Test类的字节码文件加载到方法区中
     * 2. 虚拟机自动调用main方法，main方法加载到栈内存中，开始执行第一行代码
     * 3. 发现第一行代码用到了Outer类和Inner类，所以就会把Outer类和Inner类的字节码文件加载到方法区中
     * 4. 第一行代码等号左边：相当于变量，变量名是oi，变量的类型是Outer.Inner类，表示oi以后存储的是Outer.Inner类的对象的地址值
     * 5. 第一行代码等号右边：new Outer()：在堆内存中创建一个Outer类的对象，在这个对象中会记录Outer类的成员变量a的值
     * 6. 第一行代码等号右边：new Inner()：在堆内存中创建一个Inner类的对象，在这个对象中会记录Inner类的成员变量a的值，以及隐藏的成员变量this，这个this用来记录Outer类的对象的地址值
     * 7. 赋值：将Inner类的对象的地址值赋值给oi变量
     * 8. 执行第二行代码：用oi调用show方法，show方法就会被加载到栈内存中
     * 9. 在show方法中，this记录的就是oi变量的地址值，就是Inner类的对象的地址值，还有定义的一个局部变量a，它的值是30
     * 10. 在show方法中，sout(a)：会触发就近原则，先到本方法中找，找到a，打印出来
     * 11. 在show方法中，sout(this.a)：this记录的是调用者的地址值，可以理解成我要打印Inner类的对象的成员变量a的值，所以打印出来的是20
     * 12. 在show方法中，sout(Outer.this.a)：先到Outer类的对象中找，找到a，打印出来，所以打印出来的是10
     */
}
