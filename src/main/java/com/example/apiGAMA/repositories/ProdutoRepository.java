package com.example.apiGAMA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.apiGAMA.model.Produto;
import com.example.apiGAMA.model.Usuario;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
	

}
