package com.thouraya.ex2_blog_comments.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.thouraya.ex2_blog_comments.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}