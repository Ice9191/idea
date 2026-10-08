package com.hxb;

public class demo07 {
    /**
     * 在重写一个方法的时候，它所声明的异常范围不能大于父类方法所声明的异常范围，否则会报错
     */

    public static void main(String[] args) {

    }
}

interface IPerson {
    void say() throws Exception;
}

class Student implements IPerson {
    @Override
    public void say() throws NullPointerException {
        System.out.println("我是学生");
    }
}
