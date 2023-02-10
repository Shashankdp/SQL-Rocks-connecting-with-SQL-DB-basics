package com.example.SQLRocks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public String addUser(User user){
        userRepository.save(user);
        return "User added successfully";
    }
    public User getUser(int id){
        User user=userRepository.findById(id).get(); //this command help you to find entity by primary key.
        return user;
    }

    public List<User> findAllUser(){
        return userRepository.findAll();
    }
}
