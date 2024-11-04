package com.unip.safeEats.API.services;

import com.unip.safeEats.API.entities.Fornecedor;
import com.unip.safeEats.API.repositories.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FornecedorServices {

    @Autowired
    FornecedorRepository repository;

    public List<Fornecedor> findAll(){
        return repository.findAll();
    }

}
