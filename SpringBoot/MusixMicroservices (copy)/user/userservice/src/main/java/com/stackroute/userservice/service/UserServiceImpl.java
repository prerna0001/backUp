package com.stackroute.userservice.service;

import com.stackroute.userservice.domain.User;
import com.stackroute.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository)
    {
        this.userRepository=userRepository;
    }
    @Override
    public User SaveUser(User user) {
        User saveUser=userRepository.save(user);
        return saveUser;
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

//    @Override
//    public User getUser(User id)
//    {
//        return userRepository.findById(user.getId());
//    }


}
