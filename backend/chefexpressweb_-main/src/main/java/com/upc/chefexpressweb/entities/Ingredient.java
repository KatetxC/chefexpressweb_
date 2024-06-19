package com.upc.chefexpressweb.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "ingredient")
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idIngredient;
    private String description;

    public Ingredient() {

    }

    public Ingredient(String description, int idIngredient) {
        this.description = description;
        this.idIngredient = idIngredient;
    }

    public int getIdIngredient() {
        return idIngredient;
    }

    public void setIdIngredient(int idIngredient) {
        this.idIngredient = idIngredient;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
