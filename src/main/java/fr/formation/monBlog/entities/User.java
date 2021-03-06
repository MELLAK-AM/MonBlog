package fr.formation.monBlog.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document
public class User {
	@Id
	private String id;
	private String nom;
	private String prenom;
	private String email;
	private String pseudo;

}
