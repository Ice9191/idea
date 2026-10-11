package com.collection.demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class Test {
    /**
     * 集合体系结构：整体分为Collection和Map两类
     *
     * Collection、List、Set都是接口
     * ArrayList、LinkedList、HashSet、LinkedHashSet、TreeSet都是实现类
     * Collection：单列集合，在添加数据时，每次只添加一个数据
     *     List系列集合：添加的元素是有序(存和取的顺序是一样的)、可重复、有索引
     *         ArrayList：数组实现的动态数组
     *         LinkedList：链表实现的集合
     *     Set系列集合：添加的元素是无序(存和取的顺序可能不一样)、不重复、无索引
     *         HashSet：哈希表实现的集合
     *             LinkedHashSet：链表实现的集合
     *         TreeSet：红黑树实现的集合
     * Collection：是单列集合的祖宗接口，它的功能是全部单列集合都可以继承使用的
     *  常见的成员方法：
     *      public boolean add(E e)：把给定的对象添加到当前集合中
     *      public void clear()：清空集合中所有的元素
     *      public boolean remove(E e)：把给定的对象从当前集合中删除
     *      public boolean contains(Object obj)：判断当前集合中是否包含给定的对象
     *      public boolean isEmpty()：判断当前集合是否为空
     *      public int size()：返回集合中元素的个数/集合的长度
     *
     * 注意点：
     *  Collection是一个接口，我们不能直接创建它的对象，所以，现在我们学习它的方法时，只能创建它实现类的对象，实现类：ArrayList
     */
    public static void main(String[] args) {
        // test01();
        test02();
    }

    public static void test01(){
        // 使用多态创建对象：为了学习Collection接口里面的方法
        // 自己在做一些练习的时候，还是按照之前的方式去创建对象
        Collection<String> coll = new ArrayList<>();

        // 添加元素
        // 细节1：如果我们要往List系列集合中添加数据，那么方法永远返回true，因为List系列的是允许元素重复的
        // 细节2：如果我们要往Set系列集合中添加数据，如果当前要添加的元素不存在，方法返回true，表示添加成功；如果当前要添加的元素已经存在，方法返回false，表示添加失败，因为Set系列的集合不允许重复
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        System.out.println(coll);

        // 清空集合
        // coll.clear();

        // 删除
        // 细节1：因为Collection里面定义的是共性的方法，所以此时不能通过索引进行删除，只能通过元素的对象进行删除
        // 细节2：方法会有一个布尔类型的返回值，删除成功返回true，删除失败返回false
        // 如果要删除的元素不存在，就是删除失败
        coll.remove("aaa");
        System.out.println(coll);
    }

    public static void test02(){
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        System.out.println(coll);

        // 判断元素是否包含
        // 细节：底层是依赖equals方法进行判断是否存在的
        // 所以，如果集合中存储的是自定义对象，也想通过contains方法来判断是否包含，那么在javabean类中，一定要重写equals方法
        boolean result = coll.contains("ddd");
        System.out.println(result);

        // 判断集合是否为空
        boolean empty = coll.isEmpty();
        System.out.println(empty);

        // 获取集合的长度
        coll.add("ddd");
        int size = coll.size();
        System.out.println(size);
    }
}
