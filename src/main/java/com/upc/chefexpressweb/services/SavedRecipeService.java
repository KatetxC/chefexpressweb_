package com.upc.chefexpressweb.services;

import com.upc.chefexpressweb.repositories.SavedRecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SavedRecipeService {
    @Autowired
    private SavedRecipeRepository savedRecipeRepository;

}
