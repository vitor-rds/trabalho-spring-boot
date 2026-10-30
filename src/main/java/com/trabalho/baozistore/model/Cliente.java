package com.trabalho.baozistore.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class Cliente {
    
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private LocalDate clienteDesde;
    

    //gerando os geter e seter
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDate getClienteDesde() {
        return clienteDesde;
    }
    public void setClienteDesde(LocalDate clienteDesde) {
        this.clienteDesde = clienteDesde;
    }

    //gerar os construtores
    public Cliente(Long id, String nome, LocalDate clienteDesde) {
        this.id = id;
        this.nome = nome;
        this.clienteDesde = clienteDesde;
    }
    
    public Cliente(){}

    //gerando hashcode e equals
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((clienteDesde == null) ? 0 : clienteDesde.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cliente other = (Cliente) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (clienteDesde == null) {
            if (other.clienteDesde != null)
                return false;
        } else if (!clienteDesde.equals(other.clienteDesde))
            return false;
        return true;
    }

    //gerando o tostring
    @Override
    public String toString() {
        return "Cliente [id=" + id + ", nome=" + nome + ", clienteDesde=" + clienteDesde + "]";
    }
    


    
    

    
    
    

}
