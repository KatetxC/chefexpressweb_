package com.upc.chefexpressweb.services;

import com.upc.chefexpressweb.entities.Recipe;
import com.upc.chefexpressweb.repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RecipeService {
    @Autowired
    private RecipeRepository recipeRepository;
    @Transactional
    public Recipe save(Recipe recipe){
        return recipeRepository.save(recipe);
    }
    public List<Recipe> list(){
        return recipeRepository.findAll();
    }
    public List<Recipe> findAllByNameStartingWith(String prefix){
        return recipeRepository.findAllByNameStartingWith(prefix);
    }
}
