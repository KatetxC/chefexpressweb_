package com.upc.chefexpressweb.repositories;

import com.upc.chefexpressweb.entities.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    List<Recipe> findAllByNameStartingWith(String prefix);
}
