package br.com.samaragomes.aprendendoapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.samaragomes.aprendendoapi.model.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long> {
    
    
}
