package com.thouraya.ex2_blog_comments.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.thouraya.ex2_blog_comments.model.Article;
import com.thouraya.ex2_blog_comments.service.ArticleService;

@RestController
@RequestMapping("/api/articles")
public class ArticleController {

    @Autowired
    private ArticleService service;

    @GetMapping
    public List<Article> getAllArticles() {
        return service.getAllArticles();
    }

    @GetMapping("/{id}")
    public Article getArticleById(@PathVariable Long id) {
        return service.getArticleById(id);
    }

    @PostMapping
    public Article createArticle(@RequestBody Article article) {
        return service.createArticle(article);
    }
    @GetMapping("/page")
public String articlesPage() {
    return "articles";
}
}