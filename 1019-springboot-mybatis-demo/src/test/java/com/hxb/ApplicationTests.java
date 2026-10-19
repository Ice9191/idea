package com.hxb;

import com.hxb.mapper.UserMapper;
import com.hxb.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

// 这是SpringBoot中单元测试的注解，加上这个注解就代表：当前这个测试类中的测试方法运行时，会启动这个SpringBoot项目，从而也会创建IOC容器
// 你要测试IOC容器当中的哪个bean，你就可以直接在测试类中来注入这个bean
@SpringBootTest
class ApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testFindAll(){
        List<User> userList = userMapper.findAll();
        userList.forEach(user -> System.out.println(user));
    }
}
