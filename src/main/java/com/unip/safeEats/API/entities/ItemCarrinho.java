package com.unip.safeEats.API.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.Set;


@Entity
@Table(name = "item_carrinho")
public class ItemCarrinho implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_carrinho_id")
    private Integer itemCarrinhoID;

    @OneToMany
    @JoinColumn(name = "produto_id")
    private List<Produto> produtos;

    @OneToOne
    @JoinColumn(name = "cliente_id")
    private Cliente usuario;

    @ManyToOne
    @JoinColumn(name = "carrinho_id")
    private Carrinho carrinho;

    private Integer quantidade;
    private Double preco_unitario;
    private Double subtotal;

    public ItemCarrinho() {
    }

    public ItemCarrinho(Integer itemCarrinhoID, List<Produto> produtos, Carrinho carrinho, Cliente usuario, Integer quantidade, Double preco_unitario, Double subtotal) {
        this.itemCarrinhoID = itemCarrinhoID;
        this.carrinho = carrinho;
        this.produtos = produtos;
        this.usuario = usuario;
        this.quantidade = quantidade;
        this.preco_unitario = preco_unitario;
        this.subtotal = subtotal;
    }

    public Integer getId_item_carrinho() {
        return itemCarrinhoID;
    }

    public void setId_item_carrinho(Integer itemCarrinhoID) {
        this.itemCarrinhoID = itemCarrinhoID;
    }

    public List<Produto> getId_produto() {
        return produtos;
    }

    public Cliente getId_usuario() {
        return usuario;
    }

    public void setId_usuario(Cliente usuario) {
        this.usuario = usuario;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco_unitario() {
        return preco_unitario;
    }

    public void setPreco_unitario(Double preco_unitario) {
        this.preco_unitario = preco_unitario;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Integer getItemCarrinhoID() {
        return itemCarrinhoID;
    }

    public void setItemCarrinhoID(Integer itemCarrinhoID) {
        this.itemCarrinhoID = itemCarrinhoID;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Cliente getUsuario() {
        return usuario;
    }

    public void setUsuario(Cliente usuario) {
        this.usuario = usuario;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemCarrinho that = (ItemCarrinho) o;
        return Objects.equals(itemCarrinhoID, that.itemCarrinhoID);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(itemCarrinhoID);
    }

    @Override
    public String toString() {
        return "ItemCarrinho{" +
                "itemCarrinhoID=" + itemCarrinhoID +
                ", produtos=" + produtos +
                ", usuario=" + usuario +
                ", quantidade=" + quantidade +
                ", preco_unitario=" + preco_unitario +
                ", subtotal=" + subtotal +
                '}';
    }
}
