package com.upc.chefexpressweb.entities;

import jakarta.persistence.*;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="Comment")
@RequiredArgsConstructor
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
