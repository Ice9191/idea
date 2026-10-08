package com.hxb.service.impl;

import com.hxb.dao.UserDao;
import com.hxb.pojo.User;
import com.hxb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

// @Component
@Service
public class UserServiceImpl3 implements UserService {

    // 面向接口编程，采用多态的方式
    @Autowired // 表示应用程序运行时，会自动的查询该类型的Bean对象，并赋值给成员变量userDao
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        // 1. 调用dao，获取数据
        List<String> lines = userDao.findAll();

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
            return new User(id+400, username, password, name, age, updateTime);
        }).toList(); // toList() jdk 16+才有

        return userList;
    }

}
