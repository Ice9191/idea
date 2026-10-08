package com.hxb;

public class demo05 {
    /**
     * 当程序执行的时候出现了异常，java虚拟机会帮助我们处理，但是java虚拟机处理的方式比较武断，直接终止了程序的执行
     *
     * 异常的处理：
     *  自己处理异常：
     *      1. 单个异常处理：
     *         try {
     *            // 程序可能出问题的代码
     *         }catch (异常类型 异常名称){
     *            // 放置处理异常的代码
     *         }
     *         catch (异常类型 异常名称){
     *            // 放置处理异常的代码
     *         }
     *         catch (异常类型 异常名称){
     *            // 放置处理异常的代码
     *         }catch (Exception 异常名称){
     *            // 放置处理异常的代码
     *         }finally {
     *            // 释放资源
     *         }
     *      2. 多个异常处理
     */

    public static void main(String[] args) {

        System.out.println("第一行");
        int i = 10;
        String str = null;
        int[] arr = new int[3];

        // 单个异常处理
        // try{
        //     System.out.println(i/0); // 直接System.exit(0)
        //     // 相当于 ArithmeticException e = new ArithmeticException()
        //     // 如果改为 NullPointerException e = new ArithmeticException() 则会报错不执行catch
        //     // 如果改为 Exception e = new ArithmeticException() 可以，因为ArithmeticException是Exception的子类
        //     // 如果改为 RuntimeException e = new ArithmeticException() 可以，因为ArithmeticException是RuntimeException的子类
        //     // catch中声明的异常类型应该和实际抛出的异常类型要么相同要么有继承关系才能捕获到
        // }catch (ArithmeticException e){
        //     System.out.println("除数为0");
        // }

        // 多个异常处理
        try {
            // try块中有多行代码，都有可能出现异常，程序执行的时候是从上往下执行，当碰到异常情况的时候会跳出try块，try块中剩下的代码不会执行
            System.out.println(i/0); // System.exit(0)
            System.out.println(str.length());
            arr[10] = 100;
            // 多个catch块，最后一个catch块应该为父类异常类型；会自动匹配异常类型
        }catch (ArithmeticException e){
            System.out.println("除数为0");
        }catch (NullPointerException e){
            System.out.println("空指针异常");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组索引越界");
        }catch (Exception e){
            // 抛出异常信息
            e.printStackTrace();
        }

        System.out.println("第二行");

    }
}
