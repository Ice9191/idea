package com.hxb.demo44;

public class Test1 {
    static void main() {

        // equals方法
        // 创建两个对象
        Student s = new Student("张三", 18);
        Student ss = new Student("张三", 18);

        // 比较两个对象是否相等（一般不想要比较内存地址，而是比较对象里面的属性值是否相等， 此时父类不满足需求，需要重写equals方法）
        boolean b = s.equals(ss);
        /*
            Object类中的equals方法的源码：
             public boolean equals(Object obj) {
                // this：表示方法调用者的内存地址 --- s
                // obj：传递实参的内存地址 --- ss
                // ==：引用数据类型比较的是内存地址是否相等
                return (this == obj);
             }
        */
        System.out.println(b);

        // 结论：如果我们要比较两个对象中的属性值是否相等，那么重写equals方法是必须的
    }
}
