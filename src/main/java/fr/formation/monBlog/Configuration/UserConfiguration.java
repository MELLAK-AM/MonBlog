package fr.formation.monBlog.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.formation.monBlog.repositories.UserRepository;
import fr.formation.monBlog.services.UserService;

@Configuration
public class UserConfiguration {

	@Bean
	public UserService userService(UserRepository UserRepository) {
		return new UserService(UserRepository);
	}

	
}
