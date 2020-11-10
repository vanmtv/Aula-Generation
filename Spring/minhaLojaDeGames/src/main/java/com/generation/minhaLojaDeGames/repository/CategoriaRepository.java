package com.generation.minhaLojaDeGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.minhaLojaDeGames.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria,Long>{
	public List<Categoria> findAllByDescricaoContainingIgnoreCase(String descricao);
}
