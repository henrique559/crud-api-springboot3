package com.unip.safeEats.API.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;


@Entity
@Table(name = "forma_envio")
public class FormaEnvio implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "forma_envio_id")
    private Integer formaEnvioID;

    @Column(name = "nome")
    private String nomeFormaEnvio;

    public FormaEnvio(Integer formaEnvioID, String nomeFormaEnvio) {
        this.formaEnvioID = formaEnvioID;
        this.nomeFormaEnvio = nomeFormaEnvio;
    }

    public FormaEnvio() {
    }

    public Integer getId_forma_envio() {
        return formaEnvioID;
    }

    public void setId_forma_envio(Integer formaEnvioID) {
        this.formaEnvioID = formaEnvioID;
    }

    public String getNome_forma_envio() {
        return nomeFormaEnvio;
    }

    public void setNome_forma_envio(String nomeFormaEnvio) {
        this.nomeFormaEnvio = nomeFormaEnvio;
    }


    public String toString() {
        return "FormaEnvio{" +
                "formaEnvioID=" + formaEnvioID +
                ", nomeFormaEnvio='" + nomeFormaEnvio + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FormaEnvio that = (FormaEnvio) o;
        return Objects.equals(formaEnvioID, that.formaEnvioID);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(formaEnvioID);
    }
}
