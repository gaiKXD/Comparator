package com.agaik.comparator.service;

import com.agaik.comparator.model.User;

public interface UserService {
    User findByUserName(String name);
    User auth(User user);
}
