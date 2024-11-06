package com.unip.safeEats.API.entities;


import jakarta.persistence.*;
import org.hibernate.mapping.Join;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cliente_id")
    private Integer clienteID;

    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @OneToMany
    @JoinColumn(name = "endereco_id")
    private List<Endereco> endereco = new ArrayList<>();

    private String cpf;
    private String telefone;

    public Cliente() {
    }

    public Cliente(Integer clienteID, Usuario usuario, List<Endereco> endereco, String cpf, String telefone) {
        this.clienteID = clienteID;
        this.usuario = usuario;
        this.endereco = endereco;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public Integer getId_cliente() {
        return clienteID;
    }

    public void setId_cliente(Integer clienteID) {
        this.clienteID = clienteID;
    }

    public Usuario getId_usuario() {
        return usuario;
    }

    public void setId_usuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Endereco> getId_endereco() {
        return endereco;
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
                "clienteID=" + clienteID +
                ", usuario=" + usuario +
                ", endereco=" + endereco +
                ", cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(clienteID, cliente.clienteID);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(clienteID);
    }
}
