package com.upc.chefexpressweb.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComment;
    @ManyToOne
    @JoinColumn(name="idRecipe")
    private Recipe recipe;
    private int calification;
    private String text;

    public Comment() {
    }

    public Comment(int idComment, Users user, Recipe recipe, int calification, String text) {
        this.idComment = idComment;
        this.recipe = recipe;
        this.calification = calification;
        this.text = text;
    }

    public int getIdComment() {
        return idComment;
    }

    public void setIdComment(int idComment) {
        this.idComment = idComment;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public int getCalification() {
        return calification;
    }

    public void setCalification(int calification) {
        this.calification = calification;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
