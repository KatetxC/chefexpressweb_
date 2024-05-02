package com.upc.chefexpressweb.repositories;

import com.upc.chefexpressweb.entities.SavedRecipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SavedRecipeRepository extends JpaRepository<SavedRecipe, Long> {
}
