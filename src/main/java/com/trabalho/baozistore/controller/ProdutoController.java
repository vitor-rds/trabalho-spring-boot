package com.trabalho.baozistore.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trabalho.baozistore.model.Produto;
import com.trabalho.baozistore.repository.ProdutoRepository;

@RestController 
@RequestMapping ("/produtos")
public class ProdutoController {
    
    private ProdutoRepository repository;

    public ProdutoController(ProdutoRepository repository) {
        this.repository = repository;
    }

    @PostMapping 
    public Produto create(@RequestBody Produto produto){
        return repository.save(produto);
    }

    @GetMapping 
    public List<Produto> listar(){
        return repository.findAll();
    }

    @GetMapping ("/{id}")
    public Optional<Produto> buscarPorId(@PathVariable Long id){
        return repository.findById(id);
    }

    @DeleteMapping ("/{id}")
    public void excluir(@PathVariable Long id){
        repository.deleteById(id);
    }
}
