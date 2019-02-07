package com.jeevitha.ArticleSpringBoot.dao;

import com.jeevitha.ArticleSpringBoot.entity.Article;

import java.util.List;

public interface ArticleDAO {

    public boolean addArticle(Article article);
    public Article getArticlebyID(int id);
    public List<Article> getAllArticle();
    public boolean deleteArticle(int id);
    public boolean updateArticle(Article article);
}
