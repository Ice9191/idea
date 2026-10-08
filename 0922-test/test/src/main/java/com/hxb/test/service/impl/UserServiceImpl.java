package com.hxb.test.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hxb.test.dao.UserDao;
import com.hxb.test.pojo.User;
import com.hxb.test.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {
}
