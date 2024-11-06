package com.unip.safeEats.API.services;

import com.unip.safeEats.API.entities.Produto;
import com.unip.safeEats.API.entities.Produto;
import com.unip.safeEats.API.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoServices {

    @Autowired
    private ProdutoRepository repository;

    public List<Produto> findAll(){
        return repository.findAll();
    }
    public Produto findById(Integer id){
        Optional<Produto> obj =  repository.findById(id);
        return obj.get();
    }

    public Produto insert(Produto obj){
        return repository.save(obj);
    }

    public void delete(Integer id){
        repository.deleteById(id);
    }

    public Produto update(Integer id, Produto obj){
        Produto entity = repository.getReferenceById(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(Produto entity, Produto obj) {
        entity.setNome(obj.getNome());
        entity.setQuantidade(obj.getQuantidade());
        entity.setPreco(obj.getPreco());
        entity.setDescricao(obj.getDescricao());
    }


}
