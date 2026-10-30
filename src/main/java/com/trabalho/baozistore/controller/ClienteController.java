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

import com.trabalho.baozistore.model.Cliente;
import com.trabalho.baozistore.repository.ClienteRepository;



@RestController 
@RequestMapping("/clientes")
public class ClienteController {

    private ClienteRepository repository;

    public ClienteController(ClienteRepository repository){
        this.repository = repository;
    }

    @PostMapping 
    public Cliente create(@RequestBody Cliente cliente){
        return repository.save(cliente);
    }

    @GetMapping 
    public List<Cliente> listar(){
        return repository.findAll();
    }

    @GetMapping ("/{id}")
    public Optional<Cliente> buscarPorId(@PathVariable Long id){
        return repository.findById(id);
    }

    @DeleteMapping ("/{id}")
    public void excluir(@PathVariable Long id){
        repository.deleteById(id);
    }
}
