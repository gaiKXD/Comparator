package com.agaik.comparator.service;


import com.agaik.comparator.model.RegisterUser;

public interface AuthenticationService {
    void authenticate(String login, String password);
    void register(RegisterUser registerUser);
}
