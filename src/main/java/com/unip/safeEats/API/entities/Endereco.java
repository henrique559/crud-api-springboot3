package com.unip.safeEats.API.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;


@Entity
@Table(name = "endereco")
public class Endereco implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "endereco_id")
    private Integer enderecoID;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Cliente clienteID;

    private String rua;
    private String numero;
    private String complemento;
    private String cep;

    public Endereco() {
    }

    public Endereco(Integer enderecoID, String rua, Cliente clienteID, String numero, String complemento, String cep) {
        this.enderecoID = enderecoID;
        this.rua = rua;
        this.clienteID = clienteID;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
    }

    public Cliente getFk_id_cliente() {
        return clienteID;
    }

    public void setFk_id_cliente(Cliente clienteID) {
        this.clienteID = clienteID;
    }

    public Integer getIdEndereco() {
        return enderecoID;
    }

    public void setIdEndereco(Integer enderecoID) {
        this.enderecoID = enderecoID;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Endereco endereco = (Endereco) o;
        return Objects.equals(enderecoID, endereco.enderecoID);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(enderecoID);
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "enderecoID=" + enderecoID +
                ", rua='" + rua + '\'' +
                ", numero='" + numero + '\'' +
                ", complemento='" + complemento + '\'' +
                ", cep='" + cep + '\'' +
                '}';
    }
}
