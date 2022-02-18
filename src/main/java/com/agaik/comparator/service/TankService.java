package com.agaik.comparator.service;

import com.agaik.comparator.model.Tank;

public interface TankService {
    Tank getById(int id);
    Tank findByName(String name);
}
