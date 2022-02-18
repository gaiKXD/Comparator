package com.agaik.comparator.controllers;


import com.agaik.comparator.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    User user = null;

    @GetMapping
    public String getMainPage(Model model) {
        return "main";
    }

}