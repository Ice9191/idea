package com.hxb.demo40;

import java.util.ArrayList;

public class Test1 {
    static void main() {

        // 创建一个ArrayList集合的对象
        ArrayList<String> list = new ArrayList<>();

        // 增
        list.add("aaa");
        list.add("bbb");
        // 添加成功
        // add方法在任意情况下，都会添加成功，永远不会失败
        // 为什么？因为要跟其他的集合保持统一（面向对象的思想）

        /**
         * 注意点：
         *  在集合当中无法直接添加基本数据类型的（byte short int long float double char boolean）
         *  只能添加引用数据类型（对象）
         *  如果在集合里面一定要添加基本数据类型，那么可以转成其对应的包装类
         */

        boolean b = list.add("ccc");
        // 把qqq添加到0索引的位置（范围为 0 ～ list.size()）
        list.add(0, "qqq");
        System.out.println(list);
        System.out.println(b);

        System.out.println("-----------------");

        // 删
        // 存在：删除成功 true
        // 不存在：删除失败 false
        boolean res = list.remove("QQQ"); // false
        System.out.println(res);
        // 返回删除的元素，当索引不存在时报错
        String res1 = list.remove(0);
        System.out.println(res1);

        System.out.println("-----------------");

        // 改
        // 把0索引的元素改为ZZZ
        // 返回被替换的元素
        String res2 = list.set(0, "ZZZ");
        System.out.println(res2);

        System.out.println("-----------------");

        // 查
        String s = list.get(0);
        System.out.println(s);
        // 遍历：是把容器里面的数据一个一个的拿出来，可以进行打印、计算、处理
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 只能看一看集合当中有什么元素，无法操作里面的每一个元素
        System.out.println(list);
    }
}
