package com.upc.chefexpressweb.controllers;

import com.upc.chefexpressweb.dtos.UserDTO;
import com.upc.chefexpressweb.entities.User;
import com.upc.chefexpressweb.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/register")
    public void register(@RequestBody UserDTO userdto) {
        ModelMapper modelMapper = new ModelMapper();
        User user = modelMapper.map(userdto, User.class);
        userService.insert(user);
    }

    @GetMapping("/manage/{id}")
    public UserDTO manage(@PathVariable("id") long id) {
        ModelMapper modelMapper = new ModelMapper();
        UserDTO userDTO = modelMapper.map(userService.findById(id), UserDTO.class);
        return userDTO;
    }
}
