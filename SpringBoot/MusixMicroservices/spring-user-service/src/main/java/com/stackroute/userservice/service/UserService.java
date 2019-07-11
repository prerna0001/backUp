package com.stackroute.userservice.service;

import com.stackroute.userservice.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService
{
    public User SaveUser(User user);

    public List<User> getAllUser();

//    public User getUser(User user);

}
