package com.jeevitha.ArticleSpringBoot.service;

import com.jeevitha.ArticleSpringBoot.dao.ArticleDAO;
import com.jeevitha.ArticleSpringBoot.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService{

    @Autowired
    ArticleDAO articleDAO;

    @Override
    public boolean createArticle(Article article) {
       return articleDAO.addArticle(article);
    }

    @Override
    public Article fetchByID(int id) {
        return articleDAO.getArticlebyID(id);
    }

    @Override
    public List<Article> fetchAllArticle() {
        return articleDAO.getAllArticle();
    }

    @Override
    public boolean deleteArticle(int id) {
        return articleDAO.deleteArticle(id);
    }

    @Override
    public boolean updateArticle(Article article) {
        return articleDAO.updateArticle(article);
    }
}
