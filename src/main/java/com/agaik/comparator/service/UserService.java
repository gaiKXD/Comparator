package com.agaik.comparator.service;

import com.agaik.comparator.model.Tank;
import com.agaik.comparator.model.User;

import java.util.List;

public interface UserService {
    User findByUserName(String name);
    User auth(User user);

//    Tank getById(int id);
//    List<Tank> findByName(String name);
//    void save(Tank tank);
}
