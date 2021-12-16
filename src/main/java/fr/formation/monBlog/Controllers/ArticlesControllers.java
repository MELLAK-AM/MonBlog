package fr.formation.monBlog.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import fr.formation.monBlog.entities.Article;
import fr.formation.monBlog.services.ArticleService;


@RestController
@RequestMapping("articles")
public class ArticlesControllers {
/**
 * Initialiser une variable d'instance qui contient le service
 */
	ArticleService service;
/**
 * Injection de la dépendance ArticleService qui va permettre grâce à SPRING de récupérer une instance ArticleService
 * @param service
 */
	public ArticlesControllers(ArticleService service) {
		this.service = service;
	}


	/**
	 * Retourner une list d'article
	 * @return
	 */
	@GetMapping
	public List<Article> findAll() {
		return service.findAll();
	}
	
	
	/**
	 * Retourner un article par son slug
	 * @param slug
	 * @return
	 */
	@GetMapping("{slug}") 
	public Article findBySlug(@PathVariable String slug ) {
		return this.service.findBySlug(slug);
	}

    /**
     * Méthode qui permet de sauvegarder un article
     * @param article Article
     * @return String
     */
    @PostMapping
    public Article save(@RequestBody Article article) {
        return this.service.save(article);
    }

    /**
     * Méthode qui permet de mettre à jour un article
     * @param article Article
     * @return String
     */
    @PutMapping
    public Article update(@RequestBody Article article) {
        return this.service.save(article);
    }

    /**
     * Méthode qui permet de supprimer un article
     * @param article Article
     */
    @DeleteMapping
    public void delete(@RequestBody Article article) {
        this.service.delete(article);
    }
}
