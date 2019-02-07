package com.jeevitha.ArticleSpringBoot.service;

import com.jeevitha.ArticleSpringBoot.entity.Article;

import java.util.List;

public interface ArticleService {
    public boolean createArticle(Article article);
    public Article fetchByID(int id);
    public List<Article> fetchAllArticle();
    public boolean updateArticle(Article article);
    public boolean deleteArticle(int id);
}
