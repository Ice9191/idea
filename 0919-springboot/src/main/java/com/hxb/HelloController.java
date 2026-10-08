package com.hxb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 用于标识当前类是一个请求处理类
public class HelloController {

    // 定义一个方法来接收前端发起的请求
    @RequestMapping("/hello") // |用于指定请求的URL路径
    // 这里的参数用于接收前端传递的数据，比如/hello?name=xxx
    public String hello(String name){

        System.out.println("hello " + name);

        // 返回值就是要给前端响应的数据
        return "hello " + name + "!";
    }
}
