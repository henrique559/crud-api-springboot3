package com.unip.safeEats.API.services;

import com.unip.safeEats.API.entities.Cliente;
import com.unip.safeEats.API.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServices {
    @Autowired
    private ClienteRepository repository;

    public List<Cliente> findAll(){
        return repository.findAll();

    }

}
