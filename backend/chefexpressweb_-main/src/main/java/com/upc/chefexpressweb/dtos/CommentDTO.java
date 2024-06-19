package com.upc.chefexpressweb.dtos;

import com.upc.chefexpressweb.entities.Recipe;
import com.upc.chefexpressweb.entities.Users;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentDTO {
    private Long id;
    private Users user;
    private Recipe recipe;
    private int calification;
    private String text;
}
