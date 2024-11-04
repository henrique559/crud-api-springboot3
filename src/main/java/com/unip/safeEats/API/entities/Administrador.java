package com.unip.safeEats.API.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "Administrador")
public class Administrador implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_administrador")
    private Long id_administrador;

    @JoinColumn(name = "id_usuario")
    @OneToOne
    private Usuario id_usuario;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "numRegistro")
    private String numRegistro;

    public Administrador(Long id_administrador, Usuario id_usuario, String cpf, String numRegistro) {
        this.id_administrador = id_administrador;
        this.id_usuario = id_usuario;
        this.cpf = cpf;
        this.numRegistro = numRegistro;
    }

    public Administrador() {
    }

    public Long getId_administrador() {
        return id_administrador;
    }

    public void setId_administrador(Long id_administrador) {
        this.id_administrador = id_administrador;
    }

    public Usuario getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Usuario id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(String numRegistro) {
        this.numRegistro = numRegistro;
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "id_administrador=" + id_administrador +
                ", id_usuario=" + id_usuario +
                ", cpf='" + cpf + '\'' +
                ", numRegistro='" + numRegistro + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Administrador that = (Administrador) o;
        return Objects.equals(id_administrador, that.id_administrador);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id_administrador);
    }
}
