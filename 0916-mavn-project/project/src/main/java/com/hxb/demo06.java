package com.hxb;

public class demo06 {
    /**
     * 通过throws关键字将异常交给调用者（main方法）处理
     * main方法抛出异常，就是交给JVM处理
     *
     * throws的作用：在定义一个方法的时候可以使用throws关键字声明方法可能会抛出的异常类型，表示该方法不处理异常，而是将异常抛给调用者处理
     */

    public static void main(String[] args) {
        try {
            int c = calculate();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("*********");
    }

    // throws关键字：声明方法可能会抛出的异常类型
    public static int calculate() throws ArithmeticException, NullPointerException, Exception {
        int a = 10;
        int b = 0;
        return a / b;
    }
}
