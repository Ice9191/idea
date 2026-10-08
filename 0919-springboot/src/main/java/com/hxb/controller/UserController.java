package com.hxb.controller;

import cn.hutool.core.io.IoUtil;
import com.hxb.pojo.User;
import com.hxb.service.UserService;
import com.hxb.service.impl.UserServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 用户信息的controller
 */
@RestController // 封装了@Controller注解，而@Controller注解的底层就是@Component
public class UserController {
    /**
     * 为什么服务器在给前端响应数据时，会自动将List集合转化成json格式的数据？
     * 核心是因为：加了一个@RestController注解，里面封装了@ResponseBody和@Controller注解
     * @ResponseBody的作用：将controller返回值直接作为响应体的数据返回给前端，返回值是对/集合 -> json -> 响应
     */

    /*@RequestMapping("/list")
    public List<User> list() throws Exception {
        // 1. 加载并读取users.txt文件，获取用户信息
        InputStream is = UserController.class.getClassLoader().getResourceAsStream("users.txt");
        ArrayList<String> lines = IoUtil.readLines(is, StandardCharsets.UTF_8, new ArrayList<>());

        // 2. 解析用户信息，封装为User对象 => list集合
        // 每一条数据都会封装成一个User对象，最终封装到一个List集合
        List<User> userList = lines.stream().map(line -> {
            String[] parts = line.split(",");
            Integer id = Integer.parseInt(parts[0]);
            String username = parts[1];
            String password = parts[2];
            String name = parts[3];
            Integer age = Integer.parseInt(parts[4]);
            // 将字符串日期转换为LocalDateTime对象
            LocalDateTime updateTime = LocalDateTime.parse(parts[5], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            return new User(id, username, password, name, age, updateTime);
        }).toList(); // toList() jdk 16+才有

        // 3. 返回数据（json）
        // 服务器在给前端响应数据时，会自动将List集合转化成json格式的数据，然后响应给前端
        return userList;
    }*/

    // 不能创建对象了，因为会导致耦合度较高
    // private UserService userService = new UserServiceImpl();
    // 方式一：属性注入
    // @Autowired
    // @Qualifier("userServiceImpl") // 指定要注入的bean的名称
    @Resource(name = "userServiceImpl3") // 指定要注入的bean的名称，不是Spring的注解，是Java的注解
    private UserService userService;

    // 方式二：构造函数注入
    // private final UserService userService; // 使用final修饰，保证变量初始化后不会改变，提高代码安全性
    // @Autowired // 当只有一个构造函数时，可以省略@Autowired注解
    // public UserController(UserService userService) {
    //     this.userService = userService;
    // }

    // 方式三：setter方法注入
    // private UserService userService;
    // @Autowired
    // public void setUserService(UserService userService) {
    //     this.userService = userService;
    // }

    @RequestMapping("/list")
    public List<User> list() {
        // 1. 调用service，获取数据
        List<User> userList = userService.findAll();

        // 2. 返回数据（json）
        return userList;
    }

}
