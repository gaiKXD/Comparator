package com.agaik.comparator.controllers;


import com.agaik.comparator.service.TankService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ListController {

    private final TankService tankService;

    public ListController(TankService tankService) {
        this.tankService = tankService;
    }

    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("tanks",tankService.findAll());
        return "list";
    }
}
