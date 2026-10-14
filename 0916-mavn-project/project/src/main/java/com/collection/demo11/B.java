package com.collection.demo11;

import java.util.Comparator;
import java.util.TreeSet;

public class B {
    /**
     * TreeSet对象排序练习题
     *  需求：请自行选择比较器排序和自然排序两种方式
     *  要求：存入四个字符串，"c", "ab", "df", "qwer"
     *  比较规则：按照长度排序，如果一样长则按照首字母排序
     *
     * 采取第二种排序方式：比较器排序
     */
    public static void main(String[] args) {
        // test01();
        test02();
    }

    public static void test02(){
        // 正好Comparator是函数式接口，所以这里用Lambda表达式简化
        TreeSet<String> ts = new TreeSet<>((o1, o2) -> {
            int i = o1.length() - o2.length();
            return i == 0 ? o1.compareTo(o2) : i;
        });
        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");
        System.out.println(ts);
    }

    public static void test01(){
        // 创建集合
        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
            /**
             * o1：表示当前要添加的元素
             * o2：表示已经在红黑树中存在的元素
             * 返回值：负数，表示当前要添加的元素是小的，存左边；正数，表示当前要添加的元素是大的，存右边；0，表示当前要添加的元素已经存在，舍弃不存
             * @param o1 the first object to be compared.
             * @param o2 the second object to be compared.
             * @return
             */
            @Override
            public int compare(String o1, String o2) {
                // 按照长度排序
                int i = o1.length() - o2.length();
                // 如果一样长则按照首字母排序
                return i == 0 ? o1.compareTo(o2) : i;
            }
        });

        // 添加元素
        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");

        // 打印集合
        System.out.println(ts);
    }
}
