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

import com.trabalho.baozistore.model.Pedido;
import com.trabalho.baozistore.repository.PedidoRepository;

@RestController 
@RequestMapping ("/pedidos")
public class PedidoController {

    private PedidoRepository repository;

    public PedidoController(PedidoRepository repository) {
        this.repository = repository;
    }

    @PostMapping 
    public Pedido create(@RequestBody Pedido pedido){
        return repository.save(pedido);
    }

    @GetMapping 
    public List<Pedido> listar(){
        return repository.findAll();
    }

    @GetMapping ("/{id}")
    public Optional<Pedido> buscarPorId(@PathVariable Long id){
        return repository.findById(id);
    }

    @DeleteMapping ("/{id}")
    public void excluir(@PathVariable Long id){
        repository.deleteById(id);
    }
}
