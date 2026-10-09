package com.collection.demo01;

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
     */
}
