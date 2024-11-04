package com.unip.safeEats.API.entities;


import jakarta.persistence.*;
import org.hibernate.mapping.Join;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Cliente")
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Long id_cliente;

    @OneToOne
    @JoinColumn(name = "id_usuario")
    private Usuario id_usuario;

    @OneToMany(mappedBy = "fk_id_cliente")
    private List<Endereco> id_endereco = new ArrayList<>();

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "telefone")
    private String telefone;

    public Cliente() {
    }

    public Cliente(Long id_cliente, Usuario id_usuario, List<Endereco> id_endereco, String cpf, String telefone) {
        this.id_cliente = id_cliente;
        this.id_usuario = id_usuario;
        this.id_endereco = id_endereco;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public Long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Usuario getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Usuario id_usuario) {
        this.id_usuario = id_usuario;
    }

    public List<Endereco> getId_endereco() {
        return id_endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id_cliente=" + id_cliente +
                ", id_usuario=" + id_usuario +
                ", id_endereco=" + id_endereco +
                ", cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(id_cliente, cliente.id_cliente);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id_cliente);
    }
}
