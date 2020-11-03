package org.generation.blogPessoalVan.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.generation.blogPessoalVan.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
	public List<Postagem> findAllByTituloContainingIgnoreCase(String titulo);
}
