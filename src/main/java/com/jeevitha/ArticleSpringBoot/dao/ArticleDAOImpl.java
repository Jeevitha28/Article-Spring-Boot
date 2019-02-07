package com.jeevitha.ArticleSpringBoot.dao;

import com.jeevitha.ArticleSpringBoot.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ArticleDAOImpl implements ArticleDAO{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    String insertQry="insert into article(id, title, category, price) values(?,?,?,?)";
    String getByIDQry="select * from article where id=?";
    String getAllArticleqry="select * from article";
    String deleteQry="delete from article where id=?";
    String updateQry="update article set price=?,category=? where id=?";

    @Override
    public boolean addArticle(Article article){
        return jdbcTemplate.update(insertQry, new Object[]{article.getId(), article.getTitle(),article.getCategory(),article.getPrice()} )>0;
    }

    @Override
    public List<Article> getAllArticle() {
        return jdbcTemplate.query(getAllArticleqry, new ArticleMapper());
    }

    @Override
    public Article getArticlebyID(int id) {
        return jdbcTemplate.queryForObject(getByIDQry, new Object[]{id}, new ArticleMapper());
    }

    @Override
    public boolean deleteArticle(int id) {
        return jdbcTemplate.update(deleteQry, new Object[]{id})>0;
    }

    @Override
    public boolean updateArticle(Article article) {
        return jdbcTemplate.update(updateQry, new Object[]{article.getPrice(),article.getCategory(),article.getId()})>0;
    }
}
