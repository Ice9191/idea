package com.collection.demo18;

public class Test {
    /**
     * 可变参数的练习
     *  假如需要定义一个方法求和，该方法可以灵活的完成如下需求：
     *      计算2个数据的和
     *      计算3个数据的和
     *      计算4个数据的和
     *      计算n个数据的和
     *
     * 在JDK5的时候提出了可变参数
     *  方法形参的个数是可以发生变化的
     *  格式：数据类型... 名字
     *  举例：int... args
     */
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int sum = getSum04(arr);

        int s = getSum(1, 2, 3, 5, 4);
        System.out.println(s);
    }

    /**
     * 可变参数
     * 底层就是一个数组
     * 只不过不需要我们自己创建了，java会帮我们创建好
     * 小细节：
     *  1. 在方法的形参中最多只能写一个可变参数
     *  2. 在方法当中，如果除了可变参数以外，还有其他的形参，那么可变参数要写在最后
     * @param args
     * @return
     */
    public static int getSum(int a, int... args){
        System.out.println(args); // [I@5caf905d(数组的地址值)
        int sum = 0;
        for (int arg : args) {
            sum += arg;
        }
        return sum;
    }

    /**
     * 传统方式：计算n个数据的和
     * @param arr
     * @return
     */
    public static int getSum04(int[] arr){
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    /**
     * 计算2个数据的和
     * @param a
     * @param b
     * @return
     */
    public static int getSum01(int a, int b){
        return a + b;
    }

    /**
     * 计算3个数据的和
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static int getSum02(int a, int b, int c){
        return a + b + c;
    }

    /**
     * 计算4个数据的和
     * @param a
     * @param b
     * @param c
     * @param d
     * @return
     */
    public static int getSum03(int a, int b, int c, int d){
        return a + b + c + d;
    }
}
