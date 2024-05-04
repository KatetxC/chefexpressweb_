package com.upc.chefexpressweb.controllers;

import com.upc.chefexpressweb.dtos.CommentDTO;
import com.upc.chefexpressweb.dtos.SavedRecipeDTO;
import com.upc.chefexpressweb.services.SavedRecipeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/api/saved_recipes")
public class SavedRecipeController {
    @Autowired
    private SavedRecipeService savedRecipeService;

    @GetMapping("/list/{usuarios_id}")
    public ResponseEntity<List<SavedRecipeDTO>> list(@PathVariable("usuarios_id") Long usuarios_id) {
        ModelMapper modelMapper = new ModelMapper();
        List<SavedRecipeDTO> emp = Arrays.asList(
                modelMapper.map(savedRecipeService.getSavedRecipeByUserId(usuarios_id),
                        SavedRecipeDTO[].class));
        return new ResponseEntity<>(emp, HttpStatus.OK);
    }
}
