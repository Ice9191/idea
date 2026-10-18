package com.collection.demo13;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    /**
     * HashMap的特点：
     *  1. HashMap是Map里面的一个实现类
     *  2. 没有额外需要学习的特有方法，直接使用Map里面的方法就可以了
     *  3. 特点都是由键决定的：无序、不重复、无索引
     *  4. HashMap跟HashSet底层原理是一模一样的，都是哈希表结构
     *  5. 依赖hashCode方法和equals方法保证键的唯一，跟值没有关系
     *  6. 如果键存储的是自定义对象，需要重写hashCode方法和equals方法
     *  7. 如果值存储的是自定义对象，不需要重写hashCode方法和equals方法
     */

    /**
     * 存储学生对象并遍历
     *  需求：
     *      创建一个HashMap集合，键是学生对象(Student)，值是籍贯(String)
     *      存储三个键值对元素，并遍历
     *  要求：
     *      同姓名，同年龄认为是同一个学生
     *
     * 核心点：
     *  HashMap的键位置如果存储的是自定义对象，需要重写hashCode方法和equals方法。
     */
    public static void main(String[] args) {
        // 创建HashMap的对象
        HashMap<Student, String> hashMap = new HashMap<>();

        // 创建三个学生对象
        Student s1 = new Student("张三", 23);
        Student s2 = new Student("李四", 24);
        Student s3 = new Student("王五", 25);
        Student s4 = new Student("王五", 25);

        // 添加元素
        hashMap.put(s1, "江苏");
        hashMap.put(s2, "浙江");
        hashMap.put(s3, "广东");
        hashMap.put(s4, "湖南");

        // 遍历集合
        // test01(hashMap);
        // test02(hashMap);
        test03(hashMap);
    }

    /**
     * 通过键找值
     * @param hashMap
     */
    public static void test01(HashMap<Student, String> hashMap){
        Set<Student> keys = hashMap.keySet();
        keys.forEach(key->{
            String val = hashMap.get(key);
            System.out.println(key + "=" + val);
        });
    }

    /**
     * 通过键值对
     * @param hashMap
     */
    public static void test02(HashMap<Student, String> hashMap){
        Set<Map.Entry<Student, String>> entries = hashMap.entrySet();
        entries.forEach(entry->{
            Student key = entry.getKey();
            String val = entry.getValue();
            System.out.println(key + "=" + val);
        });
    }

    /**
     * 通过Lambda表达式
     * @param hashMap
     */
    public static void test03(HashMap<Student, String> hashMap){
        hashMap.forEach((student, val)-> System.out.println(student + "=" + val));
    }
}
