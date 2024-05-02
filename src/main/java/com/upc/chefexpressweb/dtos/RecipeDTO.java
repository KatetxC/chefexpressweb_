package com.upc.chefexpressweb.dtos;

import com.upc.chefexpressweb.entities.Ingredient;

import java.time.LocalTime;
import java.util.List;

public class RecipeDTO {
    private Long id;
    private String name;
    private String description;
    private String instructions;
    private LocalTime time_preparation;
    private List<Ingredient> ingredients;
}
