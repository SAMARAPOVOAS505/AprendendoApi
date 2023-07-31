package br.com.samaragomes.aprendendoapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.samaragomes.aprendendoapi.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
}
