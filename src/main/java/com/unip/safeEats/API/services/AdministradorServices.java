package com.unip.safeEats.API.services;

import com.unip.safeEats.API.entities.Administrador;
import com.unip.safeEats.API.repositories.AdministradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministradorServices {

    @Autowired
    AdministradorRepository repository;

    public List<Administrador> findAll(){
        return repository.findAll();
    }

}
