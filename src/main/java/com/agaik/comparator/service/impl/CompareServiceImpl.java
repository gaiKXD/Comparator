package com.agaik.comparator.service.impl;

import com.agaik.comparator.model.Tank;
import com.agaik.comparator.service.CompareService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CompareServiceImpl implements CompareService {

    public List<Tank> tanks= new ArrayList<>();

    public void addToList(Tank tank){
        tanks.add(tank);
    }

    public List<Tank> getTanks() {
        return tanks;
    }

    @Override
    public Tank upgrade(Tank tank) {
        Tank tank1 = findTank(tank);
        tank1.setReload(tank1.getReload() * 2);
        return tank;
    }

    private Tank findTank(Tank tank){
        for (Tank tank1 : tanks) {
            if (tank.getId() == tank1.getId()) {
                return Optional.of(tank1).get();
            }
        }
        return Optional.<Tank>empty().get();

    }
}
