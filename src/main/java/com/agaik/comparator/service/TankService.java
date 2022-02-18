package com.agaik.comparator.service;

import com.agaik.comparator.model.Tank;

import java.util.List;
import java.util.Set;

public interface TankService {
    Tank getById(int id);
    List<Tank> findByName(String name);
    void save(Tank tank);
    Set<Tank> findAll();
}
