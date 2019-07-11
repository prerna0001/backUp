package com.stackroute.demo.service;

import com.stackroute.demo.domain.User;
import com.stackroute.demo.exception.UserAlreadyExistsException;

import java.util.List;

public interface UserService {
    public User saveUser(User user) throws UserAlreadyExistsException, UserAlreadyExistsException;//method declaration to be used in UserServiceImpl
    public List<User> getAllUsers();

}
