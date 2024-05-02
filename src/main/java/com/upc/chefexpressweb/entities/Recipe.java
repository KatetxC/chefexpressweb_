package com.upc.chefexpressweb.entities;

import jakarta.persistence.*;
import lombok.RequiredArgsConstructor;

import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name="Recipe")
@RequiredArgsConstructor
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
