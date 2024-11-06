package com.unip.safeEats.API.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;


@Entity
@Table(name = "administrador")
public class Administrador implements Serializable {


    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "administrador_id")
    private Integer administradorID;


    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuarioID;

    private String cpf;
    private String registro_numero;

    public Administrador(Integer administradorID, Usuario usuarioID, String cpf, String registro_numero) {
        this.administradorID = administradorID;
        this.usuarioID = usuarioID;
        this.cpf = cpf;
        this.registro_numero = registro_numero;
    }

    public Administrador() {
    }

    public Integer getId_administrador() {
        return administradorID;
    }

    public void setId_administrador(Integer administradorID) {
        this.administradorID = administradorID;
    }

    public Usuario getId_usuario() {
        return usuarioID;
    }

    public void setId_usuario(Usuario usuarioID) {
        this.usuarioID = usuarioID;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumRegistro() {
        return registro_numero;
    }

    public void setNumRegistro(String registro_numero) {
        this.registro_numero = registro_numero;
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "administradorID=" + administradorID +
                ", usuarioID=" + usuarioID +
                ", cpf='" + cpf + '\'' +
                ", registro_numero='" + registro_numero + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Administrador that = (Administrador) o;
        return Objects.equals(administradorID, that.administradorID);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(administradorID);
    }
}
