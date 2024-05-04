package com.upc.chefexpressweb.controllers;

import com.upc.chefexpressweb.dtos.UsersDTO;
import com.upc.chefexpressweb.entities.Users;
import com.upc.chefexpressweb.services.UsersService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UsersController {
    @Autowired
    private UsersService usersService;

    @PostMapping("/users")
    public ResponseEntity<UsersDTO> save(@RequestBody UsersDTO usersDTO){
        ModelMapper modelMapper = new ModelMapper();
        Users users = modelMapper.map(usersDTO, Users.class);
        users = usersService.save(users);
        usersDTO = modelMapper.map(users, UsersDTO.class);
        return new ResponseEntity<>(usersDTO, HttpStatus.OK);
    }
    @GetMapping("/userss")
    public ResponseEntity<List<UsersDTO>> list(){
        ModelMapper modelMapper = new ModelMapper();
        List<UsersDTO> emp = Arrays.asList(
                modelMapper.map(usersService.list(),
                        UsersDTO[].class));
        return new ResponseEntity<>(emp, HttpStatus.OK);
    }

}
