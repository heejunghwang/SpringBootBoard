package com.example.article.service;

import com.example.article.dto.CommentCreateDTO;
import com.example.article.model.Comment;
import com.example.article.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jane on 2016-12-01.
 */
@Service
public class CommentService {

    @Autowired
    CommentRepository commentRepository;

    public Comment create(CommentCreateDTO commentCreateDTO){
        return commentRepository.save(new Comment(commentCreateDTO.getContent(), commentCreateDTO.getPassword()));
    }

}
