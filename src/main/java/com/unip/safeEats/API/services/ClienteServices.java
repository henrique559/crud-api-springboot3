package com.unip.safeEats.API.services;

import com.unip.safeEats.API.entities.Cliente;
import com.unip.safeEats.API.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServices {
    @Autowired
    private ClienteRepository repository;

    public List<Cliente> findAll(){
        return repository.findAll();

    }

    public Cliente findById(Integer id){
        Optional<Cliente> obj =  repository.findById(id);
        return obj.get();

    }

    public Cliente insert(Cliente obj){
        return repository.save(obj);
    }

    public void delete(Integer id){
        repository.deleteById(id);
    }

    public Cliente update(Integer id, Cliente obj){
        Cliente entity = repository.getReferenceById(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(Cliente entity, Cliente obj) {
        entity.setCpf(obj.getCpf());
        entity.setTelefone(obj.getTelefone());
    }

}
