package com.upc.chefexpressweb.dtos;

import com.upc.chefexpressweb.entities.Ingredient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecipeDTO {
    private Long id;
    private String name;
    private String description;
    private String instructions;
    private List<Ingredient> ingredients;
}
