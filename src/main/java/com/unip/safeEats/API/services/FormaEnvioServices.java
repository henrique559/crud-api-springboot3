package com.unip.safeEats.API.services;

import com.unip.safeEats.API.entities.FormaEnvio;
import com.unip.safeEats.API.repositories.FormaEnvioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormaEnvioServices {

    @Autowired
    FormaEnvioRepository repository;

    public List<FormaEnvio> findAll(){
        return repository.findAll();
    }

}
