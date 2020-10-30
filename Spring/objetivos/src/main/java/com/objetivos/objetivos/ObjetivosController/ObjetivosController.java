package com.objetivos.objetivos.ObjetivosController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class ObjetivosController {

	@GetMapping
	public String hello() {
		return "Objetivos de aprendizagem: MySQL, Spring Boot, Revisão Java";
	}
}
