package com.unip.safeEats.API.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "FormaEnvio")
public class FormaEnvio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_forma_envio;

    @Column(name = "nome_forma_envio", length = 50)
    private String nome_forma_envio;

    public FormaEnvio(Long id_forma_envio, String nome_forma_envio) {
        this.id_forma_envio = id_forma_envio;
        this.nome_forma_envio = nome_forma_envio;
    }

    public FormaEnvio() {
    }

    public Long getId_forma_envio() {
        return id_forma_envio;
    }

    public void setId_forma_envio(Long id_forma_envio) {
        this.id_forma_envio = id_forma_envio;
    }

    public String getNome_forma_envio() {
        return nome_forma_envio;
    }

    public void setNome_forma_envio(String nome_forma_envio) {
        this.nome_forma_envio = nome_forma_envio;
    }

    @Override
    public String toString() {
        return "FormaEnvio{" +
                "id_forma_envio=" + id_forma_envio +
                ", nome_forma_envio='" + nome_forma_envio + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FormaEnvio that = (FormaEnvio) o;
        return Objects.equals(id_forma_envio, that.id_forma_envio);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id_forma_envio);
    }
}
