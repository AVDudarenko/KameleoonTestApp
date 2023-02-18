package com.example.KameleoonTestApp.controllers;

import com.example.KameleoonTestApp.security.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    private final UserDetailService userDetailService;

    @Autowired
    public HelloController(UserDetailService userDetailService) {
        this.userDetailService = userDetailService;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "hello";
    }

    @GetMapping("/showUserInfo")
    public String showUserInfo() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        System.out.println(userDetails.user());

        return "hello";
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "admin";
    }

}
