package com.upc.chefexpressweb.controllers;

import com.upc.chefexpressweb.dtos.RecipeDTO;
import com.upc.chefexpressweb.entities.Recipe;
import com.upc.chefexpressweb.services.RecipeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/apirecipe")
public class RecipeController {
    @Autowired
    private RecipeService recipeService;

    @PostMapping
    public ResponseEntity<RecipeDTO> save(@RequestBody RecipeDTO recipeDTO){
        ModelMapper modelMapper = new ModelMapper();
        Recipe recipe = modelMapper.map(recipeDTO, Recipe.class);
        recipe = recipeService.save(recipe);
        recipeDTO = modelMapper.map(recipe, RecipeDTO.class);
        return new ResponseEntity<>(recipeDTO, HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<RecipeDTO>> list(){
        ModelMapper modelMapper = new ModelMapper();
        List<RecipeDTO> emp = Arrays.asList(
                modelMapper.map(recipeService.list(),
                        RecipeDTO[].class));
        return new ResponseEntity<>(emp, HttpStatus.OK);
    }
    @GetMapping("/recipesName/{prefix}")
    public ResponseEntity<List<RecipeDTO>> findAllByNameStartingWith(@PathVariable("prefix") String prefix){
        ModelMapper modelMapper = new ModelMapper();
        List<RecipeDTO> emp = Arrays.asList(
                modelMapper.map(recipeService.findAllByNameStartingWith(prefix),
                        RecipeDTO[].class));
        return new ResponseEntity<>(emp, HttpStatus.OK);
    }

}
