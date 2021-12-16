package fr.formation.monBlog.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.formation.monBlog.entities.User;

public interface UserRepository extends MongoRepository<User, String> {
	User findByNom(String nom);
	Optional<User> findById(String id);

}
