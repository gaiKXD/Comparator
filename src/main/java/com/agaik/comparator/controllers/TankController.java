package com.agaik.comparator.controllers;

import com.agaik.comparator.model.Tank;
import com.agaik.comparator.service.TankService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/tanks")
public class TankController {

    private final TankService tankService;


    public TankController(TankService tankService) {
        this.tankService = tankService;
    }

    @GetMapping("/create-form")
    public String tankSubmit(Model model) {
        model.addAttribute("tank", new Tank());
        return "createTank";
    }


    @PostMapping("/create-form")
    public String createTank(@ModelAttribute Tank tank) {

        tankService.save(tank);
        return "resultTank";
    }

}
