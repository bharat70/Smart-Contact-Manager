package com.scm.scm.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    // user profile page

    @RequestMapping(value = "/profile")
    public String userProfile(Model model, Authentication authentication) {
        System.out.println("user profile");
        return "user/profile";
    }
}
