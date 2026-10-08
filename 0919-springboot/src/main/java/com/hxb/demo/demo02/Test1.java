package com.hxb.demo.demo02;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class Test1 {
    /**
     * HTTP协议-响应数据格式：
     *  响应行：响应数据第一行（协议，状态码，描述）
     *  响应头：第二行开始，格式为key：value
     *  响应体：最后一部分，存放响应数据
     *
     * 注意：
     *  响应头和响应体之间用空行隔开
     *  响应状态码和响应头如果没有特殊要求的话，通常不手动设置。服务器会根据请求处理的逻辑，自动设置响应状态码和响应头
     *
     * // 响应行：响应数据第一行（协议，状态码，描述）
     * HTTP/1.1 200 OK
     * 响应头：第二行开始，格式为key：value
     * // Content-Type: 该响应内容的类型，比如text/html;application/json
     * Content-Type: text/html;charset=UTF-8
     * // Content-Length: 响应内容的长度，单位是字节
     * Content-Length: 2
     * // Content-Encoding: 该响应压缩算法，比如gzip
     * Content-Encoding: gzip
     * // Cache-Control: 指示客户端应如何缓存，比如max-age=300表示可以最多缓存300秒
     * Cache-Control: max-age=3600
     * // Set-Cookie: 告诉浏览器为当前页面所在的域设置Cookie
     * Set-Cookie: JSESSIONID=1234567890
     * Date: Sat, 19 Sep 2026 16:25:37 GMT
     * Keep-Alive: timeout=60
     * Connection: keep-alive
     * // 响应体：最后一部分，存放响应数据
     * [ {id:1, name:"zhangsan", companyName:"腾讯计算机系统有限公司", description:"腾讯是一家中国公司"} ]
     */

    /**
     * HTTP中响应的状态码：分为五大类
     *  1xx：响应中-临时状态码，表示请求已经接收，告诉客户端应该继续请求或者如果它已经完成则忽略它
     *  2xx：成功-表示请求已经被成功接收，处理已完成
     *  3xx：重定向-重定向到其他地方；让客户端再发起一次请求以完成整个处理
     *  4xx：客户端错误-处理发生错误，责任在客户端。如：请求了不存在的资源、客户端未被授权、禁止访问等
     *  5xx：服务器错误-处理发生错误，责任在服务端。如：程序抛出异常等
     */

    /**
     * HTTP协议-响应数据设置：
     *  web服务器（Tomcat）对HTTP协议的响应数据进行封装，并封装到HttpServletResponse对象中，然后在调用Controller方法的时候
     *  将HttpServletResponse对象作为参数传递给该方法，然后就可以直接声明HttpServletResponse对象来设置响应数据的各个部分，比如响应行、响应头、响应体等
     */

    /**
     * 方式一：通过HttpServletResponse对象设置响应数据的各个部分
     * @param response
     * @throws IOException
     */
    @RequestMapping("/response")
    public void response(HttpServletResponse response) throws IOException {
        // 设置响应状态码
        response.setStatus(HttpServletResponse.SC_OK);

        // 设置响应头
        response.setHeader("Accept", "text/html;charset=UTF-8");

        // 设置响应体（通过IO流，以流的形式将数据响应给前端）
        // write参数中的数据是会在浏览器中展示的
        response.getWriter().write("<h1>hello response</h1>");
    }

    /**
     * 方式二：通过Spring提供的方法设置响应数据的各个部分
     *  可以将要响应的数据，包括状态码、响应头以及响应体，都封装到ResponseEntity对象当中，然后直接返回
     *  ResponseEntity对象需要指定一个泛型，用于指定响应体中的数据类型
     */
    @RequestMapping("/responseEntity")
    public ResponseEntity<String> responseEntity(){
        return ResponseEntity
                .status(401)
                .header("Host", "localhost:8080")
                .body("<h1>hello responseEntity</h1>");
    }
}
