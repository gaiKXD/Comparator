package com.agaik.comparator.controllers;


import com.agaik.comparator.repository.TankRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ListController {

    private final TankRepository tankRepository;

    public ListController(TankRepository tankRepository) {
        this.tankRepository = tankRepository;
    }

    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("tanks",tankRepository.findAll());
        return "list";
    }
}
