package com.upc.chefexpressweb.repositories;

import com.upc.chefexpressweb.entities.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
