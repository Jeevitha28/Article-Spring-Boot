package com.jeevitha.ArticleSpringBoot;

import com.jeevitha.ArticleSpringBoot.entity.Article;
import com.jeevitha.ArticleSpringBoot.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class ArticleSpringBootApplication {

	@Autowired
	ArticleService articleService;

	public static void main(String[] args) {

		ApplicationContext ac= SpringApplication.run(ArticleSpringBootApplication.class, args);
		ArticleService articleService=ac.getBean(ArticleService.class);
		System.out.println("Insert Article details:");
		Article article=new Article();
		article.setId(4);
		article.setTitle("Music");
		article.setCategory("Pop");
		article.setPrice(23.1);
		articleService.createArticle(article);

		System.out.println("Fetch article by ID");

		article=articleService.fetchByID(2);
		System.out.println(article);

		System.out.println("Fetch all article ");

		List<Article> al=articleService.fetchAllArticle();
		System.out.println(al);

		System.out.println("Delete article by id 3");

		articleService.deleteArticle(3);

		System.out.println("Update the article by id 1");

		article = articleService.fetchByID(1);
		article.setCategory("Dance");
		article.setPrice(32.3);
		articleService.updateArticle(article);

		System.out.println("List of all articles:");
		List<Article> al1=articleService.fetchAllArticle();
		System.out.println(al1);

		
	}

}

