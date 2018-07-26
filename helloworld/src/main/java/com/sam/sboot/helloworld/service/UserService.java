package com.sam.sboot.helloworld.service;

import com.sam.sboot.helloworld.dao.UserDao;
import com.sam.sboot.helloworld.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    @Autowired
    private UserDao userDao;

    public User getUserByUsername(String username) {
        return userDao.findUserByUsername(username);
    }
}
