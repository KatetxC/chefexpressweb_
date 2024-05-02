package com.upc.chefexpressweb.dtos;

import com.upc.chefexpressweb.entities.Recipe;

import java.util.List;

public class IngredientDTO {
    private Long id;
    private String description;
    private List<Recipe> recipes;
}
