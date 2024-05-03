package com.upc.chefexpressweb.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name="User_Id")
    private User user;
    @ManyToOne
    @JoinColumn(name="Recipe_Id")
    private Recipe recipe;
    private int calification;
    private String text;
    private LocalDate date;
    private LocalTime time;
}
