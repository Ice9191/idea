package com.hxb.demo.demo06;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
    /**
     * 创建不可变集合：创建不可以被修改的集合
     *  创建不可变集合的应用场景：
     *      如果某个数据不能被修改，把它防御性地拷贝到不可变集合中是个很好的实践
     *      当集合对象被不可信的库调用时，不可变形式是安全的
     *      简单理解：不想让别人修改集合中的内容，别人只能进行查询操作，就可以使用不可变集合
     *  创建不可变集合的书写格式：
     *      在List、Set、Map接口中，都存在静态的of方法，可以获取一个不可变的集合
     *      方法名称：
     *          static <E> List<E> of(E... elements)：创建一个具有指定元素的List集合对象
     *          static <E> Set<E> of(E... elements)：创建一个具有指定元素的Set集合对象
     *          static <K, V> Map<K, V> of(E... elements)：创建一个具有指定元素的Map集合对象
     *      注意：这个集合不能添加，不能删除，不能修改
     *
     * Set的of方法()的细节：
     *  当我们要获取一个不可变的Set集合时，里面的参数一定要保证唯一性
     */
    public static void main(String[] args) {
        // 创建一个不可变的List集合
        // 一旦创建完毕之后，是无法进行修改的，在下面代码中，只能进行查询操作
        List<String> list = List.of("张三", "李四", "王五", "赵六");
        Set<String> set = Set.of("张三", "李四", "王五", "赵六");
        Map<String, String> map = Map.of("张三", "18", "李四", "19");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println("--------");

        // 遍历集合
        test01(list);
        System.out.println("--------");
        test02(list);
        System.out.println("--------");
        test03(list);

        // 尝试修改
        // list.remove("李四");
        // list.add("aaa");
        // list.set(0, "aaa");
    }

    /**
     * 增强for遍历
     * @param list
     */
    public static void test01(List<String> list){
        for (String s : list) {
            System.out.println(s);
        }
    }

    /**
     * 迭代器遍历
     * @param list
     */
    public static void test02(List<String> list){
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }
    }

    /**
     * 普通for遍历
     * @param list
     */
    public static void test03(List<String> list){
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
