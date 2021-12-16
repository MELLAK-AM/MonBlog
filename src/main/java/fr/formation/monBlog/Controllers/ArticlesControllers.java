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

	
	ArticleService service;
	//IOD
	public ArticlesControllers(ArticleService service) {
		super();
		this.service = service;
	}


	//GET "/articles" -> retourne une List<Article>
	@GetMapping
	public List<Article> findAll() {
		return service.findAll();
	}
	
	
	//GET "/articles/[SLUG]" -> retourne un article avec son slug
	@GetMapping("{slug}") //http://localhost:80/articles/hello/slug
	public String findBySlug(@PathVariable String slug ) {
		return "article retourné avec un :" + slug;
	}
	
	
	//POST "/articles" -> retourne l'article que l'on vient de créer /On doit passer un article dans la requête
	 @PostMapping("post")
	 public List<Article> jePost() {
		 return service.findAll();
	 }
	 

	 @PostMapping
	public String Post(@RequestBody Article article) {
	    return  "Mon article" + article.getTitle() +" "+ article.getSlug();
	 }
	 
	 //PUT "/articles" -> retourne l'article que l'on vient de mettre à jours On doit passer l'article à modifier dans la requête*
	 @PutMapping("update")
	 public String update(@RequestBody Article article) {
		 return "mettre à jour l'article";
	 }
	 
	 
	 //- DELETE "/articles" -> Retourne rien mais supprime l'article passé dans la request
	 @DeleteMapping("delete")
	 public Article delete(@RequestBody Article article) {
		 //return "l'article est supprimé";
	 }

}
