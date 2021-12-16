package fr.formation.monBlog.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.monBlog.entities.User;
import fr.formation.monBlog.services.UserService;

@RestController
@RequestMapping("users")
public class UserController {
	
	UserService service;
	public UserController(UserService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<User> findAll(){
		return service.findAll();
	}
	
	@GetMapping("{nom}")
	public User findByNom(@PathVariable String nom) {
		return this.service.findByNom(nom);
	}
	
	@PostMapping
	public User save(@RequestBody User user) {
		return this.service.save(user);
	}
	
	@PutMapping
	public User update(@RequestBody User user) {
         return this.service.save(user);}
	
	 @DeleteMapping
	  public void delete(@RequestBody User user) {
	        this.service.delete(user);
	    }
}
