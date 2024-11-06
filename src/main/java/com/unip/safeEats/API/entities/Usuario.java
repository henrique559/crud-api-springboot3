package com.unip.safeEats.API.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuario_id")
    private Integer usuarioID;

    private String nome;

    private String email;

    private String senha;

    public Usuario() {
    }

    public Usuario(Integer usuarioID, String nome, String email, String senha) {
        this.usuarioID = usuarioID;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public Integer getIdUsuario() {
        return usuarioID;
    }

    public void setIdUsuario(Integer usuarioID) {
        this.usuarioID = usuarioID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(usuarioID, usuario.usuarioID);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(usuarioID);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "usuarioID=" + usuarioID +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
