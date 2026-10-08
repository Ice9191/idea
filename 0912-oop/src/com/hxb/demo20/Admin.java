package com.hxb.demo20;

public class Admin extends Person {

    public Admin(){}

    public Admin(String name, String username, String password) {
        super(name, username, password);
    }

    @Override
    public void work() {
        System.out.println("管理员工作");
    }
}
