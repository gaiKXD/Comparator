package com.agaik.comparator.service.impl;

import com.agaik.comparator.model.User;
import com.agaik.comparator.repository.UserRepository;
import com.agaik.comparator.service.UserService;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findByUserName(String name) {
        return userRepository.findByName(name);
    }
    public User auth(User user){
        User user1 = findByUserName(user.getName());

        if(user1 == null){
            return null;
        }

        if(user.getPass().equals(user1.getPass())){
            return user1;

        }else{
            return null;
        }
    }
}
