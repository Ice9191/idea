package com.hxb;

public class demo01 {
    /**
     * Maven的生命周期就是为了对所有的Maven项目构建过程进行抽象和统一
     *
     * Maven中有3套相互独立的生命周期
     *  clean：清理工作，比如清理上一次编译产生的class文件，清理上一次打包产生的jar文件
     *  default：核心工作，如编译、测试、打包、安装、部署等
     *  site：生成报告、发布站点等
     *  其中这3个生命周期又分为多个阶段，每个阶段都有自己的任务
     *
     * 5个重要的生命周期阶段
     *  clean：移除上一次构建生成的文件，就是把target目录删了
     *  compile：编译项目源代码，创建target目录，把编译后的class文件放到target目录下
     *  test：使用合适的单元测试框架进行测试（junit）
     *  package：将编译后的文件打包，如：jar、war等，打包后放到target目录下
     *  install：安装项目到本地仓库
     *  注意：在同一套生命周期中，当运行后面的阶段时，前面的阶段都会运行，除了clean阶段外，因为clean不是default生命周期的阶段，而是clean生命周期的阶段
     */
}
