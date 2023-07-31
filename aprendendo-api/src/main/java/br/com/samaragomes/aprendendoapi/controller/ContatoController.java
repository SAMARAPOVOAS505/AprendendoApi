package br.com.samaragomes.aprendendoapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.samaragomes.aprendendoapi.model.Contato;
import br.com.samaragomes.aprendendoapi.repository.ContatoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/contatos")
public class ContatoController {

  @Autowired
  private ContatoRepository repository;
  @GetMapping
  public List<Contato> listar(){
    return repository.findAll();
  }

  @PostMapping
  public void inserir(){
    
  }
}
