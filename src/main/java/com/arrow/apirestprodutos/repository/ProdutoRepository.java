package com.arrow.apirestprodutos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arrow.apirestprodutos.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	Produto findById(long id);

}
