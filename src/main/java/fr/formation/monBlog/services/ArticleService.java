package fr.formation.monBlog.services;

import java.util.ArrayList;
import java.util.List;

import fr.formation.monBlog.entities.Article;
import fr.formation.monBlog.repositories.ArticleRepository;

public class ArticleService {

private List<Article> articles = new ArrayList<Article>();

ArticleRepository repository;

public ArticleService(ArticleRepository repository) {
	this.repository = repository;
}

public List<Article> findAll(){
	return this.repository.findAll();
}

public void delete(Article article) {
	this.repository.delete(article);
}

public Article save(Article article) {
	return this.repository.save(article);
}

public Article findBySlug(String slug) {
	return this.repository.findBySlug(slug);
}
}
