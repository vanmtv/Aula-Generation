package org.generation.blogPessoalVan.repository;

import java.util.List;

import org.generation.blogPessoalVan.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemaRepository extends JpaRepository<Tema, Long>{
	public List<Tema> findAllByDescricaoContainingIgnoreCase(String descricao);
}
