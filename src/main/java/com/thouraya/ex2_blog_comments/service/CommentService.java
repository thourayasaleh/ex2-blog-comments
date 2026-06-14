package com.thouraya.ex2_blog_comments.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thouraya.ex2_blog_comments.model.Comment;
import com.thouraya.ex2_blog_comments.repository.CommentRepository;

@Service
public class CommentService {

    @Autowired
    private CommentRepository repository;

    public List<Comment> getAllComments() {
        return repository.findAll();
    }

    public Comment getCommentById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Comment createComment(Comment comment) {
        return repository.save(comment);
    }
}