package com.hxb.test.controller;

import com.hxb.test.pojo.User;
import com.hxb.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    // 新增
    @PostMapping("/add")
    public boolean add(@RequestBody User user) {
        return userService.save(user);
    }

    // 查询全部
    @GetMapping("/list")
    public List<User> list() {
        return userService.lambdaQuery().list();
    }

    // 根据id查询
    @GetMapping("/get/{id}")
    public User get(@PathVariable("id") Integer id) {
        return userService.getById(id);
    }
}