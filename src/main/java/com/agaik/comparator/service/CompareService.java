package com.agaik.comparator.service;

import com.agaik.comparator.model.Tank;

import java.util.List;

public interface CompareService {

 void addToList(Tank tank);
 List<Tank> getTanks();
 Tank upgrade(Tank tank);
}
