package com.upc.chefexpressweb.services;

import com.upc.chefexpressweb.entities.Ingredient;
import com.upc.chefexpressweb.repositories.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class IngredientService {
    @Autowired
    private IngredientRepository ingredientRepository;
    @Transactional
    public Ingredient save(Ingredient ingredient){
        return ingredientRepository.save(ingredient);
    }
    public List<Ingredient> list(){
        return ingredientRepository.findAll();
    }
}
