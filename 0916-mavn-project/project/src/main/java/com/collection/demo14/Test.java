package com.collection.demo14;

import java.util.*;

public class Test {
    /**
     * Map集合案例-统计投票人数
     *  需求：
     *      某个班级80名学生，现在需要组成秋游活动，班长提供了四个景点依次是(A、B、C、D)，每个学生只
     *      能选择一个景点，请统计出最终哪个景点想去的人数最多
     *  判断集合中是否包含该景点
     *      不包含：表示第一次出现
     *      包含：表示已经出现过了
     */
    public static void main(String[] args) {
        // 1. 需要先让同学们投票
        // 定义一个数组，存储4个景点
        String[] sites = {"A", "B", "C", "D"};
        // 利用随机数模拟80个同学的投票，并把投票的结果存储起来
        ArrayList<String> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 80; i++) {
            int index = random.nextInt(sites.length);
            list.add(sites[index]);
        }

        // 2. 如果要统计的东西比较多，不方便使用计数器思想
        // 我们可以定义Map集合，利用集合进行统计
        HashMap<String, Integer> hashMap = new HashMap<>();
        list.forEach(site->{
            // 判断当前的景点在Map集合当中是否存在
            if(hashMap.containsKey(site)){
                // 存在
                // 先获取当前景点已经被投票的次数
                int count = hashMap.get(site);
                // 表示当前景点又被投了一次
                count++;
                // 把新的次数再次添加到集合当中
                hashMap.put(site, count);
            }else {
                // 不存在：当前景点是第一次出现
                hashMap.put(site, 1);
            }
        });

        System.out.println(hashMap);

        // 3. 求最大值
        int max = 0;
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            int count = entry.getValue();
            if(count > max){
                max = count;
            }
        }
        System.out.println("最大值是：" + max);

        // 4. 判断哪个景点的次数跟最大值一样，如果一样，打印出来
        for (Map.Entry<String, Integer> entry : entries) {
            int count = entry.getValue();
            if(count == max){
                System.out.println("拥有最大投票次数的景点是：" + entry.getKey());
            }
        }
    }
}
