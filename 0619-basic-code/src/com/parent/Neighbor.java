package com.parent;

import com.parent.Father;

public class Neighbor {
    public void test(){
        /**
         * 测试场景一：同一个包下的无关类
         * 在 com.parent 包下创建 Neighbor.java（邻居类，非继承）。
         */

        Father f = new com.parent.Father();

        // System.out.println(f.privateVar); // ❌ 报错！私有不可见
        System.out.println(f.defaultVal); // ✅ 成功（同包可见）
        System.out.println(f.protectedVal); // ✅ 成功（同包可见，即使不继承也行）
        System.out.println(f.publicVal);
    }
}
