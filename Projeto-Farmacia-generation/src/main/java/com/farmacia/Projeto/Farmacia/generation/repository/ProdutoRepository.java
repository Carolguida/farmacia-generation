package com.farmacia.Projeto.Farmacia.generation.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.farmacia.Projeto.Farmacia.generation.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
		public List<Produto> findAllBynomeProdutoContainingIgnoreCase(String nomeProduto);
	}

