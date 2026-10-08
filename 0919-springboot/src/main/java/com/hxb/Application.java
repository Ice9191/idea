package com.hxb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类/引导类，用于启动整个项目，默认扫描当前包及其子包
 */
@SpringBootApplication // 用于标识当前类是一个启动类
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

/**
 * 起步依赖：starter
 *  1. spring-boot-starter-webmvc：包含了web应用开发所需要的常见依赖
 *  2. spring-boot-starter-webmvc-test：包含了单元测试所需要的常见依赖
 *
 * 在运行启动类中main方法的时候，其实是将内部集成进来的Tomcat服务器启动起来了，所以会在控制台中看到对应的运行日志，
 * Tomcat服务器运行起来之后，会将我们所编写的代码部署在这个服务器当中，然后就可以打开浏览器来访问了，这个Tomcat服务器也叫内嵌的Tomcat
 */