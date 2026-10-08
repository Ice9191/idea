package com.hxb.dao.impl;

import cn.hutool.core.io.IoUtil;
import com.hxb.controller.UserController;
import com.hxb.dao.UserDao;
import org.springframework.stereotype.Repository;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * UserDao的实现类
 * 注意命名规范
 */
// @Component // 表示将当前类生成的对象交给IOC容器管理
@Repository("userDao") // 用于声明dao层的bean，底层封装了@Component，传入的参数是bean的id，可以为bean命名
public class UserDaoImpl implements UserDao {

    public List<String> findAll() {
        // 1. 加载并读取users.txt文件，获取用户信息
        InputStream is = UserController.class.getClassLoader().getResourceAsStream("users.txt");
        ArrayList<String> lines = IoUtil.readLines(is, StandardCharsets.UTF_8, new ArrayList<>());
        return lines;
    }

}
