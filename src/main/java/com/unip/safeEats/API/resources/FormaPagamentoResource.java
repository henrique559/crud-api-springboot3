package com.unip.safeEats.API.resources;

import com.unip.safeEats.API.entities.FormaPagamento;
import com.unip.safeEats.API.entities.Fornecedor;
import com.unip.safeEats.API.services.FormaPagamentoServices;
import com.unip.safeEats.API.services.FornecedorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/forma_pagamento")
public class FormaPagamentoResource {
    @Autowired
    FormaPagamentoServices services;

    @GetMapping
    public ResponseEntity<List<FormaPagamento>> findAll(){
        List<FormaPagamento> formaPagamento = services.findAll();
        return ResponseEntity.ok().body(formaPagamento);
    }
}
