package com.unip.safeEats.API.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "forma_pagamento")
public class FormaPagamento implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "forma_pagamento_id")
    private Integer formaPagamentoID;

    @Column(name = "nome")
    private String nomeFormaPagamento;

    private String descricao;

    public FormaPagamento() {
    }

    public FormaPagamento(Integer formaPagamentoID, String nomeFormaPagamento, String descricao) {
        this.formaPagamentoID = formaPagamentoID;
        this.nomeFormaPagamento = nomeFormaPagamento;
        this.descricao = descricao;
    }

    public Integer getId_forma_pagamento() {
        return formaPagamentoID;
    }

    public void setId_forma_pagamento(Integer formaPagamentoID) {
        this.formaPagamentoID = formaPagamentoID;
    }

    public String getNome_forma_pagamento() {
        return nomeFormaPagamento;
    }

    public void setNome_forma_pagamento(String nomeFormaPagamento) {
        this.nomeFormaPagamento = nomeFormaPagamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FormaPagamento that = (FormaPagamento) o;
        return Objects.equals(formaPagamentoID, that.formaPagamentoID);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(formaPagamentoID);
    }

    @Override
    public String toString() {
        return "FormaPagamento{" +
                "formaPagamentoID=" + formaPagamentoID +
                ", nomeFormaPagamento='" + nomeFormaPagamento + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
