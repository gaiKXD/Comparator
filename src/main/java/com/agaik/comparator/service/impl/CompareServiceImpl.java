package com.agaik.comparator.service.impl;

import com.agaik.comparator.model.Tank;
import com.agaik.comparator.service.CompareService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompareServiceImpl implements CompareService {

    public List<Tank> tanks= new ArrayList<>();

    public void addToList(Tank tank){
        tanks.add(tank);
    }

    public List<Tank> getTanks() {
        return tanks;
    }
}
