package com.unip.safeEats.API.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;
import java.util.Set;


@Entity
@Table(name = "carrinho")
public class Carrinho implements Serializable {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "carrinho_id")
    private Integer carrinhoID;


    @OneToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    private Instant data_criacao;
    private Instant data_atualizacao;
    private String status;

    public Carrinho() {
    }

    public Carrinho(Integer carrinhoID, Set<ItemCarrinho> item_carrinho, Cliente cliente, Instant data_criacao, Instant data_atualizacao, String status) {
        this.carrinhoID = carrinhoID;
        this.cliente = cliente;
        this.data_criacao = data_criacao;
        this.data_atualizacao = data_atualizacao;
        this.status = status;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carrinho that = (Carrinho) o;
        return Objects.equals(carrinhoID, that.carrinhoID);
    }


    public int hashCode() {
        return Objects.hashCode(carrinhoID);
    }

    public Integer getId_carrinho() {
        return carrinhoID;
    }

    public void setId_carrinho(Integer carrinhoID) {
        this.carrinhoID = carrinhoID;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Instant getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(Instant data_criacao) {
        this.data_criacao = data_criacao;
    }

    public Instant getData_atualizacao() {
        return data_atualizacao;
    }

    public void setData_atualizacao(Instant data_atualizacao) {
        this.data_atualizacao = data_atualizacao;
    }

    public String getStatus_carrinho() {
        return status;
    }

    public void setStatus_carrinho(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CarrinhoCompra{" +
                "carrinhoID=" + carrinhoID +
                ", cliente=" + cliente +
                ", data_criacao=" + data_criacao +
                ", data_atualizacao=" + data_atualizacao +
                ", status='" + status + '\'' +
                '}';
    }
}
