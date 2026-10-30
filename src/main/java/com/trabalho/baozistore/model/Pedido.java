package com.trabalho.baozistore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class Pedido {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long clienteId;
    private Long produtoId;
    private Integer quantidade;

    //gerando os construtores
    public Pedido(Long id, Long clienteId, Long produtoId, Integer quantidade) {
        this.id = id;
        this.clienteId = clienteId;
        this.produtoId = produtoId;
        this.quantidade = quantidade;
    }
    public Pedido(){}


    //gerando os geters e setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public Long getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(Long produtoId) {
        this.produtoId = produtoId;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }


    //gerando tostring
    @Override
    public String toString() {
        return "Pedido [id=" + id + ", clienteId=" + clienteId + ", produtoId=" + produtoId + ", quantidade="
                + quantidade + "]";
    }


    //gerando hashcode e equals
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((clienteId == null) ? 0 : clienteId.hashCode());
        result = prime * result + ((produtoId == null) ? 0 : produtoId.hashCode());
        result = prime * result + ((quantidade == null) ? 0 : quantidade.hashCode());
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
        Pedido other = (Pedido) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (clienteId == null) {
            if (other.clienteId != null)
                return false;
        } else if (!clienteId.equals(other.clienteId))
            return false;
        if (produtoId == null) {
            if (other.produtoId != null)
                return false;
        } else if (!produtoId.equals(other.produtoId))
            return false;
        if (quantidade == null) {
            if (other.quantidade != null)
                return false;
        } else if (!quantidade.equals(other.quantidade))
            return false;
        return true;
    }

    

}
