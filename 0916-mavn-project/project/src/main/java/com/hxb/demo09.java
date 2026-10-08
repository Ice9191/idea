package com.hxb;

public class demo09 {
    /**
     * finally语句：修饰的代码无论是否抛出异常，都会执行，除非在执行到finally语句之前程序异常退出或者调用了System.exit(0)
     * 语法格式：
     *      try {
     *          // 可能会抛出异常的代码
     *      } catch (异常类 e) {
     *          // 处理异常的代码
     *      } finally {
     *          // 释放资源
     *      }
     */

    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        // 如果在try之前退出程序，finally语句不会执行
        // System.exit(0);
        try {
            System.out.println(a / b);
            System.exit(0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            // 只有try执行了代码，finally语句才会执行，除了try中使程序终止了
            System.out.println("finally语句");
        }

        System.out.println("程序继续执行");
        System.out.println(test());
    }

    /**
     * 在try语句中，在执行return语句时，要返回的结果已经准备好了，在程序转到finally语句之前，try中先把要返回的结果
     * 存放到不同的局部变量中，执行完finally语句后，再返回局部变量中的结果，因此，即使finally语句中修改了x的值，也不会影响到return语句的结果
     */
    public static int test(){
        int x = 1;
        try {
            x++;
            return x; // return 2
        }finally {
            // 在finally中改变不了try中返回的结果
            x++;
            System.out.println(x); // 3
        }
    }
}
