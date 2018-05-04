package com.nearu.service;

import com.nearu.dao.UserMapper;
import com.nearu.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public boolean insertUser(User user){
        return userMapper.insert(user) > 0;
    }
}
