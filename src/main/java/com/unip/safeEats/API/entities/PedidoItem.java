package com.unip.safeEats.API.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;



@Entity
@Table(name = "pedido_item")
public class PedidoItem implements Serializable {


    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pedido_item_id")
    private Integer pedidoItemID;

    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private Pedido pedidos;

    @OneToMany
    @JoinColumn(name = "produto_id")
    private Set<Produto> produtos;

    private Double quantidade;
    private Double preco_unitario;

    public PedidoItem() {
    }

    public PedidoItem(Integer pedidoItemID, Pedido pedidos, Set<Produto> produtos, Double quantidade, Double preco_unitario) {
        this.pedidoItemID = pedidoItemID;
        this.pedidos = pedidos;
        this.produtos = produtos;
        this.quantidade = quantidade;
        this.preco_unitario = preco_unitario;
    }

    public Integer getId_pedido_item() {
        return pedidoItemID;
    }

    public void setId_pedido_item(Integer pedidoItemID) {
        this.pedidoItemID = pedidoItemID;
    }

    public Pedido getPedidos() {
        return pedidos;
    }

    public Set<Produto> getProdutos() {
        return produtos;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco_unitario() {
        return preco_unitario;
    }

    public void setPreco_unitario(Double preco_unitario) {
        this.preco_unitario = preco_unitario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PedidoItem that = (PedidoItem) o;
        return Objects.equals(pedidoItemID, that.pedidoItemID);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(pedidoItemID);
    }

    @Override
    public String toString() {
        return "PedidoItem{" +
                "pedidoItemID=" + pedidoItemID +
                ", pedidos=" + pedidos +
                ", produtos=" + produtos +
                ", quantidade=" + quantidade +
                ", preco_unitario=" + preco_unitario +
                '}';
    }

}
