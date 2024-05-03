package com.upc.chefexpressweb.controllers;

import com.upc.chefexpressweb.dtos.CommentDTO;
import com.upc.chefexpressweb.entities.Comment;
import com.upc.chefexpressweb.services.CommentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @PostMapping("/comment")
    public ResponseEntity<CommentDTO> save(@RequestBody CommentDTO commentDTO){
        ModelMapper modelMapper = new ModelMapper();
        Comment comment = modelMapper.map(commentDTO, Comment.class);
        comment = commentService.save(comment);
        commentDTO = modelMapper.map(comment, CommentDTO.class);
        return new ResponseEntity<>(commentDTO, HttpStatus.OK);
    }

}
