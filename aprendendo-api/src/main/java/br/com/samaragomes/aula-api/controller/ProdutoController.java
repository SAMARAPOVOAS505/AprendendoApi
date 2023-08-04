package br.com.samaragomes.aprendendoapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.samaragomes.aprendendoapi.model.Produto;
import br.com.samaragomes.aprendendoapi.repository.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/produtos")
public class ProdutoController {

  @Autowired
  private ProdutoRepository repository;
  @GetMapping
  public List<Produto> listar(){
    return repository.findAll();
  }

  @PostMapping
  public void inserir(){
    
  }
}
