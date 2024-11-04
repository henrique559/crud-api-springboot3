package com.unip.safeEats.API.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "FormaPagamento")
public class FormaPagamento implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_forma_pagamento;

    @Column(name = "nome_forma_pagamento", length = 20, nullable = false)
    private String nome_forma_pagamento;

    @Column(name = "descricao")
    private String descricao;

    public FormaPagamento() {
    }

    public FormaPagamento(Long id_forma_pagamento, String nome_forma_pagamento, String descricao) {
        this.id_forma_pagamento = id_forma_pagamento;
        this.nome_forma_pagamento = nome_forma_pagamento;
        this.descricao = descricao;
    }

    public Long getId_forma_pagamento() {
        return id_forma_pagamento;
    }

    public void setId_forma_pagamento(Long id_forma_pagamento) {
        this.id_forma_pagamento = id_forma_pagamento;
    }

    public String getNome_forma_pagamento() {
        return nome_forma_pagamento;
    }

    public void setNome_forma_pagamento(String nome_forma_pagamento) {
        this.nome_forma_pagamento = nome_forma_pagamento;
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
        return Objects.equals(id_forma_pagamento, that.id_forma_pagamento);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id_forma_pagamento);
    }

    @Override
    public String toString() {
        return "FormaPagamento{" +
                "id_forma_pagamento=" + id_forma_pagamento +
                ", nome_forma_pagamento='" + nome_forma_pagamento + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
