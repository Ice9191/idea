package com.Reflection.Demo01;

public class Demo01 {
    /**
     * 动态代理：无侵入式的给代码增加额外的功能，防止修改原代码
     *
     * 程序为什么需要代理？
     *  对象如果嫌身上干的事太多了的话，可以通过代理来转移部分职责
     *  当调用者想要去调用对象的方法的时候，其实不是通过对象去调用，而是先去调用代理的方法，然后再由代理去调用对象的方法
     *
     * 代理长什么样？
     *  对象有什么方法想被代理，代理就一定要有对应的方法
     *
     * 代理如何知道要代理的方法？
     *  通过接口来实现，后面的对象和代理都需要实现这个接口，接口中就是被代理的所有方法
     *
     * 如何为java对象创建一个代理对象？
     *  java.lang.reflect.Proxy类：提供了为对象产生代理对象的方法：
     *      public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)
     *      参数一：用于指定用哪个类加载器去加载生成的代理类
     *      参数二：指定接口，这些接口用于指定生成的代理长什么，也就是有哪些方法
     *      参数三：用来指定生成的代理对象要干什么事情
     */

    public static void main(String[] args) {

        // 获取代理对象
        BigStar bigStar = new BigStar("鸡哥");
        Star proxy = ProxyUtil.createProxy(bigStar);

        // 调用唱歌方法
        // proxy.sing("只因你太美");实际上调用的是invoke方法
        String result = proxy.sing("只因你太美");
        System.out.println(result);

        // 调用跳舞方法
        proxy.jump();
    }
}
