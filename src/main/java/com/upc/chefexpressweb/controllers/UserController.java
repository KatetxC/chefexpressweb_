package com.upc.chefexpressweb.controllers;

import com.upc.chefexpressweb.dtos.CommentDTO;
import com.upc.chefexpressweb.dtos.UserDTO;
import com.upc.chefexpressweb.entities.User;
import com.upc.chefexpressweb.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public ResponseEntity<UserDTO> save(@RequestBody UserDTO userDTO){
        ModelMapper modelMapper = new ModelMapper();
        User user = modelMapper.map(userDTO, User.class);
        user = userService.save(user);
        userDTO = modelMapper.map(user, UserDTO.class);
        return new ResponseEntity<>(userDTO, HttpStatus.OK);
    }
    @GetMapping("/users")
    public ResponseEntity<List<UserDTO>> list(){
        ModelMapper modelMapper = new ModelMapper();
        List<UserDTO> emp = Arrays.asList(
                modelMapper.map(userService.list(),
                        UserDTO[].class));
        return new ResponseEntity<>(emp, HttpStatus.OK);
    }

}
