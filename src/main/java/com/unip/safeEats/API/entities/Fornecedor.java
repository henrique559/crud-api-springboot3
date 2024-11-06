package com.unip.safeEats.API.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.*;

@Entity
@Table(name = "fornecedor")
public class Fornecedor implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fornecedor_id")
    private Integer fornecedorID;

    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuarioID;

    @OneToMany
    @JoinColumn(name = "endereco_id")
    private List<Endereco> enderecos = new ArrayList<>();

    private String cnpj;
    private String tipo_produto;
    private String razao_social;
    private String nome_fantasia;

    public Fornecedor() {
    }

    public Fornecedor(Integer fornecedorID, Usuario usuarioID, String cnpj, String tipo_produto, String razao_social, String nome_fantasia) {
        this.fornecedorID = fornecedorID;
        this.usuarioID = usuarioID;
        this.cnpj = cnpj;
        this.tipo_produto = tipo_produto;
        this.razao_social = razao_social;
        this.nome_fantasia = nome_fantasia;
    }

    public Integer getId_fornecedor() {
        return fornecedorID;
    }

    public void setId_fornecedor(Integer fornecedorID) {
        this.fornecedorID = fornecedorID;
    }

    public Usuario getId_usuario() {
        return usuarioID;
    }

    public void setId_usuario(Usuario usuarioID) {
        this.usuarioID = usuarioID;
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
                "fornecedorID=" + fornecedorID +
                ", usuarioID=" + usuarioID +
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
        return Objects.equals(fornecedorID, that.fornecedorID);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(fornecedorID);
    }
}
