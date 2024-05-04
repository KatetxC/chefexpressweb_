package com.upc.chefexpressweb.controllers;

import com.upc.chefexpressweb.dtos.IngredientDTO;
import com.upc.chefexpressweb.entities.Ingredient;
import com.upc.chefexpressweb.services.IngredientService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class IngredientController {
    @Autowired
    private IngredientService ingredientService;

    @PostMapping("/ingredient")
    public ResponseEntity<IngredientDTO> save(@RequestBody IngredientDTO ingredientDTO){
        ModelMapper modelMapper = new ModelMapper();
        Ingredient ingredient = modelMapper.map(ingredientDTO, Ingredient.class);
        ingredient = ingredientService.save(ingredient);
        ingredientDTO = modelMapper.map(ingredient, IngredientDTO.class);
        return new ResponseEntity<>(ingredientDTO, HttpStatus.OK);
    }

}
