package com.unip.safeEats.API.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;
import java.util.Set;



@Entity
@Table(name = "pedido")
public class Pedido implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pedido_id")
    private Integer pedidoID;

    @OneToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @OneToMany
    @JoinColumn(name = "formas_pagamento_id")
    private Set<FormaPagamento> formasPagamento;

    @OneToMany
    @JoinColumn(name = "forma_envio_id")
    private Set<FormaEnvio> formasEnvio;

    private Instant data_pedido;
    private Instant data_criacao;
    private String status;

    public Pedido() {

    }

    public Pedido(Integer pedidoID, Cliente cliente, Set<FormaPagamento> formasPagamento, Set<FormaEnvio> formasEnvio, Instant data_pedido, Instant data_criacao, String status) {
        this.pedidoID = pedidoID;
        this.cliente = cliente;
        this.formasPagamento = formasPagamento;
        this.formasEnvio = formasEnvio;
        this.data_pedido = data_pedido;
        this.data_criacao = data_criacao;
        this.status = status;
    }

    public Integer getCod_pedido() {
        return pedidoID;
    }

    public void setCod_pedido(Integer pedidoID) {
        this.pedidoID = pedidoID;
    }

    public Cliente getClientes() {
        return cliente;
    }

    public void setClientes(Cliente cliente) {
        this.cliente = cliente;
    }

    public Set<FormaPagamento> getForma_pagamento() {
        return formasPagamento;
    }

    public void setForma_pagamento(Set<FormaPagamento> formasPagamento) {
        this.formasPagamento = formasPagamento;
    }

    public Set<FormaEnvio> getForma_envio() {
        return formasEnvio;
    }

    public void setForma_envio(Set<FormaEnvio> formasEnvio) {
        this.formasEnvio = formasEnvio;
    }

    public Instant getDt_pedido() {
        return data_pedido;
    }

    public void setDt_pedido(Instant data_pedido) {
        this.data_pedido = data_pedido;
    }

    public Instant getDt_criacao() {
        return data_criacao;
    }

    public void setDt_criacao(Instant data_criacao) {
        this.data_criacao = data_criacao;
    }

    public String getStatus_pedido() {
        return status;
    }

    public void setStatus_pedido(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "pedidoID=" + pedidoID +
                ", cliente=" + cliente +
                ", formasPagamento=" + formasPagamento +
                ", formasEnvio=" + formasEnvio +
                ", data_pedido=" + data_pedido +
                ", data_criacao=" + data_criacao +
                ", status='" + status + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pedido pedido = (Pedido) o;
        return Objects.equals(pedidoID, pedido.pedidoID);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(pedidoID);
    }
}
