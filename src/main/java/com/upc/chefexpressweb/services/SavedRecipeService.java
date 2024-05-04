package com.upc.chefexpressweb.services;

import com.upc.chefexpressweb.entities.SavedRecipe;
import com.upc.chefexpressweb.repositories.SavedRecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SavedRecipeService {
    @Autowired
    private SavedRecipeRepository savedRecipeRepository;
    public List<SavedRecipe> getSavedRecipeByUserId(Long userId) {
        return savedRecipeRepository.findByUserId(userId);
    }
}
