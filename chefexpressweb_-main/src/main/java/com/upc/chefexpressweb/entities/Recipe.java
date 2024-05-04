package com.upc.chefexpressweb.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.LocalTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String instructions;
    private LocalTime time_preparation;
    @ManyToMany
    @JoinTable(
            name="Recipe_Ingredients",
            joinColumns = @JoinColumn(name = "Recipe_Id"),
            inverseJoinColumns = @JoinColumn(name = "Ingredient_Id")
    )
    private List<Ingredient> ingredients;
}
