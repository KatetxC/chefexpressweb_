package com.upc.chefexpressweb.dtos;

import com.upc.chefexpressweb.entities.Recipe;
import com.upc.chefexpressweb.entities.User;

import java.time.LocalDate;
import java.time.LocalTime;

public class SavedRecipeDTO {
    private Long id;
    private User user;
    private Recipe recipe;
    private LocalDate created_date;
    private LocalTime created_time;
}
