package com.upc.chefexpressweb.controllers;

import com.upc.chefexpressweb.services.SavedRecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/saved_recipes")
public class SavedRecipeController {
    @Autowired
    private SavedRecipeService savedRecipeService;
}
