package com.sam.sboot.helloworld.controller;

import com.sam.sboot.helloworld.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/hello/")
public class HelloController {

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("hello", "hello, current time is " + new Date());
        return "index";
    }

    @RequestMapping("/userList")
    public String getUsers(Model modle) {

        List<User> users = new ArrayList<>();
        User u1 = new User();
        u1.setId(111111);
        u1.setUsername("adfdfdf");
        u1.setPassword("afdfd");
        users.add(u1);

        User u2 = new User();
        u2.setId(111111);
        u2.setUsername("adfdfdf");
        u2.setPassword("afdfd");
        users.add(u2);

        modle.addAttribute("users", users);

        System.out.println("Running here.....");
        System.out.println("users: " + users);
        return "hello/list";
    }


}
