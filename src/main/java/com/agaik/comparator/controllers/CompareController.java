package com.agaik.comparator.controllers;



import com.agaik.comparator.model.Tank;
import com.agaik.comparator.repository.TankRepository;
import com.agaik.comparator.service.CompareService;
import com.agaik.comparator.service.TankService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CompareController {

    private final TankService tankService;
    private final CompareService compareService;

    public CompareController(TankService tankService, CompareService compareService) {
        this.tankService = tankService;
        this.compareService = compareService;
    }

    @GetMapping("/compare")
    public String getAll(Model model){
        model.addAttribute("tanks", compareService.getTanks());
        return "compare";
    }
    @GetMapping("/compare/add/{id}")
    public String addToList(@PathVariable int id){
        Tank tank = tankService.getById(id);
        compareService.addToList(tank);
        return "compare";
    }

    @GetMapping("/findtank")
    public String tankForm(Model model) {
        model.addAttribute("tank", new Tank());
        return "tankform";
    }

    @PostMapping("/findtank")
    public String tankForm(@ModelAttribute Tank tank) {

        Tank tank1 = tankService.findByName(tank.getName());

        if(tank1 == null  ) {
            System.out.println("Incorect form");
            return "resultRejected";
        }

        compareService.addToList(tank1);
        return "result";

    }
}
