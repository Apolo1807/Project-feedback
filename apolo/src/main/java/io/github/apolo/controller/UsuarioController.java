package io.github.apolo.controller;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.istack.NotNull;

import io.github.apolo.dto.MovieDTO;

@RestController
@RequestMapping("/api/profile")
public class UsuarioController {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID id;
	
	@NotEmpty
	@Column(length = 255)
	@Email
	private String email;
	
	@NotNull
	@Column
	private Integer password;
	
	@ManyToOne
	@JoinColumn(name = "id_filme")
	private MovieDTO filmes;

}
