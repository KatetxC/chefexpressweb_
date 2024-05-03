package com.upc.chefexpressweb.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.upc.chefexpressweb.repositories.CommentRepository;
import com.upc.chefexpressweb.entities.Comment;
import com.upc.chefexpressweb.services.CommentService;

import java.util.List;

@Service
public class CommentServiceImplement implements CommentService {
    @Autowired
    private CommentRepository irA;
    @Transactional
    @Override
    public Comment insertar(Comment comment) {
        return irA.save(comment);
    }
    @Transactional
    @Override
    public void eliminar(int idComment) {
        irA.deleteById((long) idComment);
    }

    @Override
    public Comment listarId(int idComment) {
        return irA.findById((long) idComment).orElse(new Comment());
    }

    @Override
    public List<Comment> listar() {
        return irA.findAll();
    }
}

