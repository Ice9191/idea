package com.Reflection.Demo01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 类的作用：创建一个代理
public class ProxyUtil {

    // 方法的作用：给一个明星的对象，创建一个代理
    // 形参就是被代理的明星对象
    // 返回值就是给明星创建的代理
    public static Star createProxy(BigStar bigStar){
        /**
         * 类加载器：是 Java 中负责把类的字节码加载到 JVM 中，并生成对应的 Class 对象的组件。
         * 类加载器主要做四件事：
         *  1. 加载：根据类的全限定名（如 com.example.User）找到对应的字节码。
         *  2. 链接：验证字节码、准备静态变量、解析符号引用。
         *  3. 初始化：执行静态代码块和静态变量赋值。
         *  4. 生成 Class 对象：在方法区/元空间保存类元数据，在堆中创建 Class 对象。
         *
         * Star.class：获取Star这个接口对应的Class对象
         *
         * 给一个已有的 Java 对象创建代理对象，本质是：生成一个新的对象，它持有目标对象的引用，并拦截对目标方法的调用，在调用前后插入逻辑，再转发给目标对象。
         */

        /**
         * 需求：外面的人想要大明星唱一首歌
         *  1. 获取代理的对象
         *      代理对象 = ProxyUtil.createProxy(被代理的明星对象);
         *  2. 再调用代理的方法
         *      代理对象先调用invoke方法，在invoke方法中就是代理要干的事情
         */

        Star star = (Star) Proxy.newProxyInstance(
                ProxyUtil.class.getClassLoader(), // 参数一：用于指定用哪个类加载器去加载生成的代理类
                new Class[]{Star.class}, // 参数二：指定接口，这些接口用于指定生成的代理长什么，也就是有哪些方法

                // 参数三：用来指定生成的代理对象要干什么事情（调用invoke方法）
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        /**
                         * 参数一：代理的对象，就是star
                         * 参数二：要运行的方法，就是sing方法
                         * 参数三：调用sing方法时，传递的实参，当代理对象.唱歌的方法("你好")时，就会把"你好"传入args[0]
                         */

                        if("sing".equals(method.getName())){
                            System.out.println("准备话筒，收钱");
                        }else if("jump".equals(method.getName())){
                            System.out.println("准备场地，收钱");
                        }

                        // 去找大明星开始唱歌或者跳舞
                        // 代码的形式：调用大明星里面的sing方法或者jump方法
                        return method.invoke(bigStar, args);
                    }
                }
        );
        return star;
    }
}
