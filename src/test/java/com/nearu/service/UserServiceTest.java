package com.nearu.service;

import com.nearu.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserServiceTest{

    @Resource
    private UserService userService;

    @Test
    public void insertUser() {
        User user = new User();
        long now = System.currentTimeMillis();
        user.setAddedTime(now);
        user.setModifiedTime(now);
        user.setTel("15550028324");
        user.setStatus(1);
        user.setType(1);
        user.setUserId(1L);
        user.setUserName("home");
        userService.insertUser(user);
    }
}