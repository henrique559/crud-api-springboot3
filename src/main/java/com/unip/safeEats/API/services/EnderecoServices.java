package com.unip.safeEats.API.services;

import com.unip.safeEats.API.entities.Endereco;
import com.unip.safeEats.API.repositories.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoServices {
    @Autowired
    private EnderecoRepository repository;

    public List<Endereco> findAll(){
        return repository.findAll();
    }
}
