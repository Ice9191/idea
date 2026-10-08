package com.hxb.demo41;

import com.hxb.demo25.A;

import java.util.ArrayList;

public class Test {
    /**
     * 基本数据类型对应的包装类：
     *  基本类型     包装类
     *   byte       Byte
     *   short      Short
     *   int        Integer     --- 重要
     *   long       Long
     *   float      Float
     *   double     Double
     *   char       Character
     *   boolean    Boolean
     *
     * 包装类的内存结构：
     *  public class Memory {
     *      public static void main(String[] args) {
     *          int a = 10;
     *          // 等同于：Integer b = new Integer(20);
     *          Integer b = 20;
     *      }
     *  }
     *      1. 程序启动后，先把Memory类的字节码文件加载到方法区，虚拟机开始调用main方法，main方法加载进栈，开始执行第一行代码
     *      2. 在栈里声明了一个变量a，10是真实的存储在变量a中的，而不是存在堆中
     *      3. 第二行代码：等号左边：在栈中声明了一个变量b；等号右边：在堆中创建了一个对象，里面的属性value赋值为20，再把对象的内存地址赋值给b
     *
     * 包装类：用对象把基本数据类型包起来，以后可以使用对应类中的方法
     */

    static void main() {

        // 创建一个集合
        ArrayList<Integer> list = new ArrayList<>();

        // 添加数据
        list.add(1);
        list.add(2);
        list.add(3);

        // 遍历集合
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            Integer li = list.get(i);
            if(i == list.size() - 1){
                System.out.println(li + "]");
            }else{
                System.out.print(li + ", ");
            }
        }
    }
}
