package com.upc.chefexpressweb.entities;

import jakarta.persistence.*;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="SavedRecipe")
@RequiredArgsConstructor
public class SavedRecipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name="User_Id")
    private User user;
    @ManyToOne
    @JoinColumn(name="Recipe_Id")
    private Recipe recipe;
    private LocalDate created_date;
    private LocalTime created_time;
}
