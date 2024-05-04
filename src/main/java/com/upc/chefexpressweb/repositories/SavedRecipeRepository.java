package com.upc.chefexpressweb.repositories;

import com.upc.chefexpressweb.entities.Recipe;
import com.upc.chefexpressweb.entities.SavedRecipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SavedRecipeRepository extends JpaRepository<SavedRecipe, Long> {
    List<SavedRecipe>findByUserId(Long id);
}
