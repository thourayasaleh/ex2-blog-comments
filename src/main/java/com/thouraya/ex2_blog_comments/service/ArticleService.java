package com.thouraya.ex2_blog_comments.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thouraya.ex2_blog_comments.model.Article;
import com.thouraya.ex2_blog_comments.repository.ArticleRepository;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository repository;

    public List<Article> getAllArticles() {
        return repository.findAll();
    }

    public Article getArticleById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Article createArticle(Article article) {
        return repository.save(article);
    }
}