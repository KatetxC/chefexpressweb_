package com.upc.chefexpressweb.entities;

import jakarta.persistence.*;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "User")
@RequiredArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String first_name;
    private String last_name;
    private String password;
    private String email;
    private LocalDate creation_date;
}
