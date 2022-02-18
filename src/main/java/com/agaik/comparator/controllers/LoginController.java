package com.agaik.comparator.controllers;


import com.agaik.comparator.model.User;
import com.agaik.comparator.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    private User logged;
    private final UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("user",new User());
        return "login";
    }
    @PostMapping("/login")
    public String loginResult(@ModelAttribute User user){
        User user1 = userService.auth(user);

        if(user1 == null){
            return "loginFail";
        }

        logged = user1;
        return "main";
    }
}
