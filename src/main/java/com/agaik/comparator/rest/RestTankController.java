package com.agaik.comparator.rest;


import com.agaik.comparator.model.Tank;
import com.agaik.comparator.repository.TankRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestTankController {

    private final TankRepository tankRepository;

    public RestTankController(TankRepository tankRepository) {
        this.tankRepository = tankRepository;
    }

    @GetMapping("/tanks")
    public List<Tank> findAll(){
        return tankRepository.findAll();
    }

    @GetMapping("/tanks/{tanksId}")
    public List<Tank> findbyId(@PathVariable int tanksId){
        return tankRepository.findTankById(tanksId);
    }
}
