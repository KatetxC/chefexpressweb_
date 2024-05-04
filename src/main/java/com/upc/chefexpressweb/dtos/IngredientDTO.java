package com.upc.chefexpressweb.dtos;

import com.upc.chefexpressweb.entities.Recipe;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IngredientDTO {
    private Long id;
    private String description;
    private List<Recipe> recipes;
}
