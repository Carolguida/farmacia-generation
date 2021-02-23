package com.farmacia.Projeto.Farmacia.generation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmacia.Projeto.Farmacia.generation.model.Categoria;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	public List<Categoria> findAllBynomeCategoriaContainingIgnoreCase(String nomeCategoria);
}
