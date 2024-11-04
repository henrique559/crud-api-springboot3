package com.unip.safeEats.API.services;

import com.unip.safeEats.API.entities.FormaPagamento;
import com.unip.safeEats.API.repositories.FormaPagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormaPagamentoServices {

    @Autowired
    FormaPagamentoRepository repository;
    public List<FormaPagamento> findAll(){
        return repository.findAll();
    }

}
