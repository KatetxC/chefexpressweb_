package com.upc.chefexpressweb.services;


import com.upc.chefexpressweb.entities.Comment;


import java.util.List;

public interface CommentService {
    public Comment insertar(Comment comment);

    public void eliminar(int idComment);

    public Comment listarId(int idComment);

    List<Comment> listar();

}
