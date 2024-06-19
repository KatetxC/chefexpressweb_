package com.upc.chefexpressweb.repositories;

import com.upc.chefexpressweb.entities.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}
