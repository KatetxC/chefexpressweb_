package com.upc.chefexpressweb.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.LocalTime;
import java.util.List;


@Entity
@Table(name = "Recipe")
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRecipe;
    private String name;
    private String description;
    private String instructions;
    @ManyToOne
    @JoinColumn(name = "idIngrediente")
    private Ingredient ingredient;

    public Recipe() {
    }

    public Recipe(int idRecipe, String name, String description, String instructions, Ingredient ingredient) {
        this.idRecipe = idRecipe;
        this.name = name;
        this.description = description;
        this.instructions = instructions;
        this.ingredient = ingredient;
    }

    public int getIdRecipe() {
        return idRecipe;
    }

    public void setIdRecipe(int idRecipe) {
        this.idRecipe = idRecipe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }
}

