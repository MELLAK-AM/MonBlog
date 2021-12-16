package fr.formation.monBlog.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.formation.monBlog.entities.User;
import fr.formation.monBlog.repositories.UserRepository;


public class UserService {
private List<User> users = new ArrayList<User>();

UserRepository UserRepository;

public UserService(UserRepository repository) {
	this.UserRepository = repository;
}

public List<User> findAll(){
	return this.UserRepository.findAll();
}

public void delete(User user) {
	this.UserRepository.delete(user);
}

public Optional<User> findById(String id) {
	return this.UserRepository.findById(id);
}

public User save(User user) {
	return this.UserRepository.save(user);
}

public User findByNom(String nom) {
	return this.UserRepository.findByNom(nom);
}
}
