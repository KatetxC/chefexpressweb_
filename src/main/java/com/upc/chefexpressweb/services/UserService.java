package com.upc.chefexpressweb.services;
import com.upc.chefexpressweb.entities.User;
import com.upc.chefexpressweb.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public void insert(User user) {
        userRepository.save(user);
    }
    public User findById(Long id) {
        return userRepository.findById(id).orElse(new User());
    }
}
