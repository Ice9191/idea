package com.FileNIO.Demo22;

import java.io.*;

public class Test {
    /**
     * 对象序列化：把java对象写入到文件中去
     * 对象反序列化：把文件里的java对象读出来
     * 序列化流就是实现对象的序列化或者对象的反序列化的流
     *
     * ObjectOutputStream：对象字节输出流
     *  可以把java对象进行序列化：把java对象存入到文件中去
     *  构造方法：
     *      public ObjectOutputStream(OutputStream out)：创建对象字节输出流，包装基础的字节输出流
     *  成员方法：
     *      public final void writeObject(Object obj) throws IOException：把对象写出去
     *  注意：对象如果要参与序列化，必须实现序列化接口（java.io.Serializable）
     *
     * ObjectInputStream：对象字节输入流
     *  可以把java对象进行反序列化：把存储在文件中的java对象读入到内存中来
     *  构造方法：
     *      public ObjectInputStream(InputStream is)：创建对象字节输入流，包装基础的字节输入流
     *  成员方法：
     *      public final Object readObject()：把存储在文件中的java对象读出来
     *
     * 如果要一次序列化多个对象，要如何实现？
     *  用一个ArrayList集合存储多个对象，然后直接对集合进行序列化即可
     *  注意：ArrayList集合以及实现了序列化接口，即已经实现了Serializable接口
     */
    public static void main(String[] args) {
        test01();
        test02();
    }

    public static void test01(){
        try (
                // 创建一个对象字节输出流包装原始的字节输出流
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("0916-mavn-project/project/src/main/java/com/FileNIO/Demo22/aaa.txt"));
                ) {
            // 创建一个java对象
            User user = new User("admin", "张三", 18, "123456");

            // 序列化对象到文件中去
            oos.writeObject(user);
            System.out.println("对象序列化成功！！");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void test02(){
        try (
                // 创建一个对象字节输入流管道，包装低级的字节输入流与源文件接通
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("0916-mavn-project/project/src/main/java/com/FileNIO/Demo22/aaa.txt"));
        ) {
            // 把文件中的对象读出来
            User obj = (User) ois.readObject();
            System.out.println("对象反序列化成功！！");
            System.out.println(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
