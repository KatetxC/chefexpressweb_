package com.upc.chefexpressweb.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
    @ManyToOne(targetEntity = Ingredient.class)
    @JoinColumn(name = "recipe_id", referencedColumnName = "id")
    @JsonBackReference("recipe_items")
    private Ingredient ingredient;
}
