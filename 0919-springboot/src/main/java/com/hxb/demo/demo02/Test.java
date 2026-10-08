package com.hxb.demo.demo02;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 用于标识当前类是一个请求处理类
public class Test {
    /**
     * HTTP协议：Hyper Text Transfer Protocol，超文本传输协议，规定了浏览器和服务器之间数据传输的规则
     *  数据传输的规则：就是客户端与服务端进行数据交互的数据格式
     *  HTTP协议规定了请求数据的数据格式和响应数据的数据格式，这样客户端和服务器端才能进行数据交互
     *
     * HTTP协议的特点：
     *  1. 基于TCP协议：面向连接，安全
     *  2. 基于请求-响应模型的：一次请求对应一次响应
     *  3. HTTP协议是无状态的协议：对于事务处理没有记忆能力。每次请求-响应都是独立的。
     *      缺点：多次请求之间不能共享数据
     *      优点：速度快
     */

    /**
     * HTTP协议-请求数据格式：
     *  请求行：请求数据第一行：请求方法，资源路径，协议以及协议版本
     *  请求头：第二行开始，格式为key: value
     *  请求体：POST请求，存放请求参数
     *
     * 注意：
     *  请求头和请求体之间有一个空行
     *  GET请求：请求参数在请求行中，没有请求体，比如：/hello?name=zhangsan。GET请求大小在浏览器中是有限制的
     *  POST请求：请求参数在请求体中，POST请求大小是没有限制的
     *
     * // 请求行：请求数据第一行：请求方法，资源路径，协议以及协议版本
     * GET /hello?name=zhangsan HTTP/1.1
     * // 请求头：第二行开始，格式为key: value
     * // Accept：浏览器能够接收的资源类型，比如：application/json表示能接受json格式的数据，text/html表示能接受html格式的数据，* /*表示能接受所有格式的数据
     * Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,* /*;q=0.8,application/signed-exchange;v=b3;q=0.7
     * // Accept-Encoding：浏览器可以支持的压缩类型，比如：gzip,deflate等
     * Accept-Encoding:gzip,deflate,br,zstd
     * // Accept-Language：浏览器可以支持的语言，服务器可以据此返回不同语言的网页
     * Accept-Language:zh-CN,zh;q=0.9,en;q=0.8,en-GB;q=0.7,en-US;q=0.6
     * Cache-Control:no-cache
     * Connection:keep-alive
     * // Host：请求的主机名
     * Host:localhost:8080
     * Pragma:no-cache
     * Sec-Fetch-Dest:document
     * Sec-Fetch-Mode:navigate
     * Sec-Fetch-Site:none
     * Sec-Fetch-User:?1
     * Upgrade-Insecure-Requests:1
     * // User-Agent：浏览器版本，可以知道当前请求是用什么浏览器发送的
     * User-Agent:Mozilla/5.0(Macintosh;Intel MacOS X 10_15_7)AppleWebKit/537.36(KHTML,like Gecko)Chrome/153.0.0.0Safari/537.36Edg/153.0.0.0
     * sec-ch-ua:"Microsoft Edge";v="153","Not_A Brand";v="8","Chromium";v="153"
     * sec-ch-ua-mobile:?0
     * sec-ch-ua-platform:"macOS"
     *
     * POST /brand HTTP/1.1
     * Accept: application/json, text/plain, * /*
     * Accept-Encoding:gzip,deflate,br
     * Accept-Language:zh-CN,zh;q=0.9
     * // Content-Length：请求体的长度，单位为字节
     * Content-Length:161
     * // Content-Type：请求体的数据格式，比如：application/json表示请求体数据格式为json
     * Content-Type:application/json;charset=UTF-8
     * Cookie:Idea-8296eb32=841b16f0-0cfe-495a-9cc9-d5aaa71501a6;JSESSIONID=0FDE4E430876BD9C5C955F061207386F
     * Host:localhost:8080
     * User-Agent:Mozilla/5.0(Windows NT 10.0;Win64;x64)AppleWebKit/537.36(KHTML,like Gecko)Chrome/...
     * // 请求体：POST请求，存放请求参数
     * { "status":1, "brandName":"黑马", "companyName":"黑马程序员", "id":"", "description":"黑马程序员" }
     */

    /**
     * HTTP协议-请求数据获取：
     *  web服务器（Tomcat）对HTTP协议的请求数据进行解析，并封装到HttpServletRequest对象中，然后在调用Controller方法的时候
     *  将HttpServletRequest对象作为参数传递给该方法，然后就可以直接声明HttpServletRequest对象来获取请求数据的各个部分，比如请求行、请求头、请求体等
     */

    @RequestMapping("/request") // 用于指定请求的URL路径
    public String request(HttpServletRequest request){
        // 获取请求方式
        String method = request.getMethod(); // GET
        System.out.println("请求方式：" + method);
        System.out.println("--------------------------------------------------");

        // 获取url地址
        String url = request.getRequestURL().toString(); // http://localhost:8080/request
        System.out.println("请求url地址：" + url);
        // uri拿到的是后面的资源访问路径
        String uri = request.getRequestURI(); // /request
        System.out.println("请求uri地址：" + uri);
        System.out.println("--------------------------------------------------");

        // 获取请求协议
        String protocol = request.getProtocol(); // HTTP/1.1
        System.out.println("请求协议：" + protocol);
        System.out.println("--------------------------------------------------");

        // 获取请求参数 -- name, age
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        System.out.println("请求参数：name = " + name + ", age = " + age);
        System.out.println("--------------------------------------------------");

        // 获取请求头 -- Accept
        String accept = request.getHeader("Accept");
        System.out.println("请求头：Accept = " + accept);
        System.out.println("--------------------------------------------------");

        return "ok";
    }
}
