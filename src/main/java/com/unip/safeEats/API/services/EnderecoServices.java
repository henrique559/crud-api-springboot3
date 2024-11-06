package com.unip.safeEats.API.services;

import com.unip.safeEats.API.entities.Endereco;
import com.unip.safeEats.API.entities.Endereco;
import com.unip.safeEats.API.repositories.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoServices {
    @Autowired
    private EnderecoRepository repository;

    public List<Endereco> findAll(){
        return repository.findAll();
    }

    public Endereco findById(Integer id){
        Optional<Endereco> obj =  repository.findById(id);
        return obj.get();
    }

    public Endereco insert(Endereco obj){
        return repository.save(obj);
    }

    public void delete(Integer id){
        repository.deleteById(id);
    }

    public Endereco update(Integer id, Endereco obj){
        Endereco entity = repository.getReferenceById(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(Endereco entity, Endereco obj) {
        entity.setCep(obj.getCep());
        entity.setRua(obj.getRua());
        entity.setComplemento(obj.getComplemento());
        entity.setNumero(obj.getNumero());
    }
}
