package fr.formation.monBlog.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.formation.monBlog.entities.Article;


public interface ArticleRepository extends MongoRepository<Article, String> {

}
