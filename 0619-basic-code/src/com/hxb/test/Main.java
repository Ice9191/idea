package com.hxb.test;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        // student.name = "张三"; // 报错！因为 private 不可见
        // 必须通过方法来操作
        student.setName("张三");
        student.setAge(18);
        System.out.println("姓名：" + student.getName() + "，年龄：" + student.getAge());

        Animal animal = new Animal();
        animal.name = "动物";
        animal.eat();
        Dog dog = new Dog();
        dog.name = "狗";
        dog.eat();
        dog.bark();
        Cat cat = new Cat();
        cat.name = "猫";
        cat.eat();

        // 多态的核心是：父类引用指向子类对象（Animal a = new Dog();）。调用重写的方法时，运行时实际执行的是子类的方法。
        // 多态的写法：父类引用 指向 子类对象
        // new Dog() 是一个子类实例对象，但是引用是父类类型，所以可以调用父类的方法。
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.name = "旺旺";
        myCat.name = "咪咪";

        // 调用eat()方法时，表现完全不同
        myDog.eat(); // 输出：旺旺正在吃东西...
        myCat.eat(); // 输出：咪咪正在优雅地吃鱼...

        // 多态的最大用处：作为方法参数，让代码更通用
        feedAnimal(myDog);
        feedAnimal(myCat);
    }

    // 不管是狗还是猫，都可以喂食
    public static void feedAnimal(Animal animal){
        System.out.println("喂食中...");
        animal.eat();
    }
}