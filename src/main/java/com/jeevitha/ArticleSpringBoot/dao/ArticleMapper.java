package com.jeevitha.ArticleSpringBoot.dao;

import com.jeevitha.ArticleSpringBoot.entity.Article;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ArticleMapper implements RowMapper<Article> {

    public Article mapRow(ResultSet resultSet, int i) throws SQLException {
        Article article=new Article();
        article.setId(resultSet.getInt("id"));
        article.setTitle(resultSet.getString("title"));
        article.setCategory(resultSet.getString("category"));
        article.setPrice(resultSet.getDouble("price"));
        return article;

    }
}
