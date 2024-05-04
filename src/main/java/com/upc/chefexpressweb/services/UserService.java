package com.upc.chefexpressweb.services;

import com.upc.chefexpressweb.entities.User;
import com.upc.chefexpressweb.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Transactional
    public User save(User user){
        return userRepository.save(user);
    }
    public List<User> list(){
        return userRepository.findAll();
    }
}
