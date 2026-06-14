package com.thouraya.ex2_blog_comments.controller;

import com.thouraya.ex2_blog_comments.service.ArticleService;
import com.thouraya.ex2_blog_comments.service.CommentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    private final ArticleService articleService;
    private final CommentService commentService;

    public ViewController(ArticleService articleService,
                          CommentService commentService) {
        this.articleService = articleService;
        this.commentService = commentService;
    }

    @GetMapping("/articles-view")
    public String articlesPage(Model model) {

        model.addAttribute("articles",
                articleService.getAllArticles());

        return "articles";
    }

    @GetMapping("/comments-view")
    public String commentsPage(Model model) {

        model.addAttribute("comments",
                commentService.getAllComments());

        return "comments";
    }
}