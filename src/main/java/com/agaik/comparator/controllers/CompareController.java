package com.agaik.comparator.controllers;


import com.agaik.comparator.model.Tank;
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
        Tank tank1 = new Tank();
        tank1.setName(tank.getName());
        compareService.addToList(tank1);
        return "compare";
    }

    @GetMapping("/tanks/tank/{id}")
    public String upgrade(@PathVariable int id){
        Tank tank = tankService.getById(id);
        compareService.upgrade(tank);
        return "resultTank";
    }

    @GetMapping("/findtank")
    public String tankForm(Model model) {
        model.addAttribute("tank", new Tank());
        return "tankform";
    }

    @PostMapping("/findtank")
    public String tankForm(@ModelAttribute Tank tank) {
        String name = tank.getName();

        tank = tankService.findByName(name).get(0);
        Tank tank2 = new Tank(tank.getName(), tank.getTier(), tank.getType(),
        tank.getNation(), tank.getDamage(), tank.getReload());

        tankService.save(tank2);
        compareService.addToList(tank2);
        return "resultTank";
    }

}
