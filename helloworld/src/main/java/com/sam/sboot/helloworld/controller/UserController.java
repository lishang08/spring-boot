package com.sam.sboot.helloworld.controller;

import com.sam.sboot.helloworld.entity.User;
import com.sam.sboot.helloworld.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/{username}")
    public User findUserByUsername(@PathVariable String username) {
       return this.userService.getUserByUsername(username);
    }
}
