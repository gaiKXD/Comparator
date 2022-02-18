package com.agaik.comparator.service.impl;

import com.agaik.comparator.model.Tank;
import com.agaik.comparator.repository.TankRepository;
import com.agaik.comparator.service.TankService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TankServiceImpl implements TankService {


    private final TankRepository tankRepository;

    public TankServiceImpl(TankRepository tankRepository) {
        this.tankRepository = tankRepository;
    }

    public List<Tank> findAll() {
        return tankRepository.findAll();
    }
    public void save(Tank tank) {
        tankRepository.save(tank);
    }

    public Tank getById(int id){
        return tankRepository.getById(id);
    }

    public Tank findByName(String name){
        return tankRepository.findByName(name);
    }

}
