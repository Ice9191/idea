package com.hxb;

import java.text.ParseException;

public class demo08 {
    /**
     * throw和throws的区别
     *  throws：
     *      用在方法名后面，跟的是异常类名，表示方法可能会抛出指定的异常
     *      可以跟多个异常类名，用逗号隔开
     *      表示抛出异常，由该方法调用者处理
     *      表示出现异常的一种可能性，并一定会出现异常
     *  throw：
     *      用在方法体中，跟的是异常对象，表示抛出指定的异常
     *      只能抛出一个异常对象
     *      表示抛出异常，由方法体内的语句处理
     *      表示抛出了具体的异常，真实的产生了Exception对象
     */

    public static void main(String[] args) {
        try {
            int c = calculate();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        try {
            show();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("程序继续执行");
    }

    public static int calculate() throws ArithmeticException {
        int a = 10;
        int b = 0;
        if(b == 0){
            // 抛出异常对象，参数为异常信息字符串
            throw new ArithmeticException("除数不能为0");
        }
        int c = a / b;
        return c;
    }

    public static void show() throws ParseException {
        int a = 10;
        if(a == 0){
            throw new ParseException("a不能为0", 1);
        }
    }
}
