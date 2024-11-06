package com.unip.safeEats.API.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.*;


@Entity
@Table(name = "produto")
public class Produto {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "produto_id")
    private Integer produtoID;

    @OneToMany
    @JoinColumn(name = "fornecedor_id")
    private Set<Fornecedor> fornecedores = new HashSet<>();

    private String nome;
    private String descricao;
    private Double preco;
    private Integer quantidade;

    public Produto(Integer produtoID, String nome, String descricao, Double preco, Integer quantidade, Set<Fornecedor> fornecedores) {
        this.produtoID = produtoID;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
        this.fornecedores = fornecedores;
    }

    public Produto() {
    }

    public Integer getId_produto() {
        return produtoID;
    }

    public void setId_produto(Integer produtoID) {
        this.produtoID = produtoID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Set<Fornecedor> getFornecedores() {
        return fornecedores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(produtoID, produto.produtoID);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(produtoID);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "produtoID=" + produtoID +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }


}
