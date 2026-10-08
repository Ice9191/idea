package com.hxb.demo20;

public class StudentManager extends Person {

    // 参数为Person：此时可以传递Person本身的对象，同时也可以传递Person所有的子类对象
    public void register(Person person) {
        System.out.println("姓名为" + person.getName() + "注册成功，用户名为" + person.getUsername() + "，密码为" + person.getPassword());

        // 传递不同的对象，调用不同类里面的work方法
        person.work();
    }
}
