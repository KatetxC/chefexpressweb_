package com.upc.chefexpressweb.entities;

import jakarta.persistence.*;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="Ingredient")
@RequiredArgsConstructor
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
}
