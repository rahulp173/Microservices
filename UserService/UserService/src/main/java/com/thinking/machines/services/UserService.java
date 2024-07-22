package com.thinking.machines.services;

import java.util.List;

import com.thinking.machines.entities.User;

public interface UserService {

    User saveUser(User user);

    List<User> getAllUsers();

    User getUser(String userId);

}
