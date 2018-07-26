package com.sam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloworldController {

    @RequestMapping("/hello")
    public String hello(Model model, @RequestParam(value = "name", required = false, defaultValue = "World") String name) {
        model.addAttribute("name", name);
        return "hello";
    }

    @RequestMapping("/index")
    public String index(Model model, @RequestParam(value = "greeting", required = false, defaultValue = "Hello World") String greeting) {
        model.addAttribute("greeting", "You give me nothing, but I give u the whole world!");
        return "index";
    }


}