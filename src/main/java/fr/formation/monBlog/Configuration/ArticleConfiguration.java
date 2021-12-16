package fr.formation.monBlog.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.formation.monBlog.repositories.ArticleRepository;
import fr.formation.monBlog.services.ArticleService;

@Configuration
public class ArticleConfiguration {
	
@Bean
public ArticleService articleService(ArticleRepository ArticleRepository) {
	return new ArticleService(ArticleRepository);
}
}
