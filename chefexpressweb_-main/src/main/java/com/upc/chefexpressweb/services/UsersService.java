package com.upc.chefexpressweb.services;

import com.upc.chefexpressweb.entities.Users;
import com.upc.chefexpressweb.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsersService {
    @Autowired
    private UsersRepository usersRepository;
    @Transactional
    public Users save(Users users){
        return usersRepository.save(users);
    }
    public List<Users> list(){
        return usersRepository.findAll();
    }
}
