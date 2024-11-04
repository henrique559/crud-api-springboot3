package com.unip.safeEats.API.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "Fornecedor")
public class Fornecedor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_fornecedor")
    private Long id_fornecedor;

    @OneToOne
    @JoinColumn(name = "id_usuario")
    private Usuario id_usuario;

    @Column(name = "cnpj", length = 14)
    private String cnpj;

    @Column(name = "tipo_produto", length = 15)
    private String tipo_produto;

    @Column(name = "razao_social", length = 50)
    private String razao_social;

    @Column(name = "nome_fantasia", length = 35)
    private String nome_fantasia;

    @ManyToMany(mappedBy = "fornecedores")
    private Set<Produto> produtos = new HashSet<>();

    public Fornecedor() {
    }

    public Fornecedor(Long id_fornecedor, Usuario id_usuario, String cnpj, String tipo_produto, String razao_social, String nome_fantasia, Set<Produto> produtos) {
        this.id_fornecedor = id_fornecedor;
        this.id_usuario = id_usuario;
        this.cnpj = cnpj;
        this.tipo_produto = tipo_produto;
        this.razao_social = razao_social;
        this.nome_fantasia = nome_fantasia;
        this.produtos = produtos;
    }

    public Set<Produto> getProdutos() {
        return produtos;
    }

    public Long getId_fornecedor() {
        return id_fornecedor;
    }

    public void setId_fornecedor(Long id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }

    public Usuario getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Usuario id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTipo_produto() {
        return tipo_produto;
    }

    public void setTipo_produto(String tipo_produto) {
        this.tipo_produto = tipo_produto;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    public String getNome_fantasia() {
        return nome_fantasia;
    }

    public void setNome_fantasia(String nome_fantasia) {
        this.nome_fantasia = nome_fantasia;
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "id_fornecedor=" + id_fornecedor +
                ", id_usuario=" + id_usuario +
                ", cnpj='" + cnpj + '\'' +
                ", tipo_produto='" + tipo_produto + '\'' +
                ", razao_social='" + razao_social + '\'' +
                ", nome_fantasia='" + nome_fantasia + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fornecedor that = (Fornecedor) o;
        return Objects.equals(id_fornecedor, that.id_fornecedor);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id_fornecedor);
    }
}
