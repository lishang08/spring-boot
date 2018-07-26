package com.sam;

import java.util.Locale;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootConfiguration
@EnableAutoConfiguration
public class Application {


    @RequestMapping("/hello")
    public String hello(Locale locale, Model model) {
        return "hello world";
    }

    @RequestMapping("/uid")
    String uid(HttpSession session) {
        UUID uid = (UUID) session.getAttribute("uid");
        if (uid == null) {
            uid = UUID.randomUUID();
        }
        session.setAttribute("uid", uid);
        return session.getId();
    }

    @RequestMapping("/errorPage")
    public String error() {
        return "Oh no... something wrong in the server!";
    }

    @RequestMapping("/")
    public String index() {
        return "Index page!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


}
