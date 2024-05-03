package com.upc.chefexpressweb.services;

import com.upc.chefexpressweb.entities.Comment;
import com.upc.chefexpressweb.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;
    @Transactional
    public Comment save(Comment comment){
        return commentRepository.save(comment);
    }
    public List<Comment> list(){
        return commentRepository.findAll();
    }
}
