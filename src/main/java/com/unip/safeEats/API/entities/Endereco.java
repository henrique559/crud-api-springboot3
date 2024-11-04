package com.unip.safeEats.API.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "Endereco")
public class Endereco implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_endereco")
    private Long idEndereco;

    @Column(name = "rua", length = 70)
    private String rua;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "fk_id_cliente")
    private Cliente fk_id_cliente;

    @Column(name = "numero", length = 4)
    private String numero;

    @Column(name = "complemento", length = 20)
    private String complemento;

    @Column(name = "cep", length = 8)
    private String cep;

    public Endereco() {
    }

    public Endereco(Long idEndereco, String rua, Cliente fk_id_cliente, String numero, String complemento, String cep) {
        this.idEndereco = idEndereco;
        this.rua = rua;
        this.fk_id_cliente = fk_id_cliente;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
    }

    public Cliente getFk_id_cliente() {
        return fk_id_cliente;
    }

    public void setFk_id_cliente(Cliente fk_id_cliente) {
        this.fk_id_cliente = fk_id_cliente;
    }

    public Long getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Long idEndereco) {
        this.idEndereco = idEndereco;
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
        return Objects.equals(idEndereco, endereco.idEndereco);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idEndereco);
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "idEndereco=" + idEndereco +
                ", rua='" + rua + '\'' +
                ", numero='" + numero + '\'' +
                ", complemento='" + complemento + '\'' +
                ", cep='" + cep + '\'' +
                '}';
    }
}
