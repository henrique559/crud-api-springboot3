package com.unip.safeEats.API.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "ItemCarrinho")
public class ItemCarrinho implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_item_carrinho;

    @ManyToMany(mappedBy = "item_carrinho")
    private List<Produto> id_produto;

    @Column(name = "id_usuario")
    private Usuario id_usuario;

    @Column(name = "quantidade")
    private Integer quantidade;

    @Column(name = "preco_unitario")
    private Double preco_unitario;

    @Column(name = "subtotal")
    private Double subtotal;

    public ItemCarrinho() {
    }

    public ItemCarrinho(Long id_item_carrinho, List<Produto> id_produto, Usuario id_usuario, Integer quantidade, Double preco_unitario, Double subtotal) {
        this.id_item_carrinho = id_item_carrinho;
        this.id_produto = id_produto;
        this.id_usuario = id_usuario;
        this.quantidade = quantidade;
        this.preco_unitario = preco_unitario;
        this.subtotal = subtotal;
    }

    public Long getId_item_carrinho() {
        return id_item_carrinho;
    }

    public void setId_item_carrinho(Long id_item_carrinho) {
        this.id_item_carrinho = id_item_carrinho;
    }

    public List<Produto> getId_produto() {
        return id_produto;
    }

    public Usuario getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Usuario id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco_unitario() {
        return preco_unitario;
    }

    public void setPreco_unitario(Double preco_unitario) {
        this.preco_unitario = preco_unitario;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemCarrinho that = (ItemCarrinho) o;
        return Objects.equals(id_item_carrinho, that.id_item_carrinho);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id_item_carrinho);
    }

    @Override
    public String toString() {
        return "ItemCarrinho{" +
                "id_item_carrinho=" + id_item_carrinho +
                ", id_produto=" + id_produto +
                ", id_usuario=" + id_usuario +
                ", quantidade=" + quantidade +
                ", preco_unitario=" + preco_unitario +
                ", subtotal=" + subtotal +
                '}';
    }
}
