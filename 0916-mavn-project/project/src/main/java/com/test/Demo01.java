package com.test;

// import org.junit.jupiter.api.Test;

public class Demo01 {
    /**
     * 可以在main目录下编写单元测试的代码，这样是不符合测试规范的，因此需要maven的依赖范围
     * 依赖范围：依赖的jar包，默认情况下，可以在任何地方使用。可以通过<scope>设置其作用范围
     * 作用范围：
     *  主程序范围有效（main文件夹范围内），定义为1
     *  测试程序范围有效（test文件夹范围内），定义为2
     *  是否参与打包运行（package指令范围内），定义为3
     *
     * scope值：
     *  1. compile（默认）：1，2，3 -- 重点
     *  2. test：2，范例：junit -- 重点
     *  3. provided：1，2，范例：servlet-api
     *  4. runtime：2，3，范例：jdbc驱动
     */

    public static void main(String[] args) {

        System.out.println("hello world");
    }

    // @Test
    // public void test(){
    //     System.out.println("hello test");
    // }
}
