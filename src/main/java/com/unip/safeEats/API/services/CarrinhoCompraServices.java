package com.unip.safeEats.API.services;

import com.unip.safeEats.API.entities.Carrinho;
import com.unip.safeEats.API.repositories.CarrinhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarrinhoCompraServices {

    @Autowired
    private CarrinhoRepository repository;

    public List<Carrinho> findAll(){
        return repository.findAll();
    }

    public Carrinho findById(Integer id){
        Optional<Carrinho> obj =  repository.findById(id);
        return obj.get();

    }

    public Carrinho insert(Carrinho obj){
       return repository.save(obj);
    }

    public void delete(Integer id){
         repository.deleteById(id);
    }

    public Carrinho update(Integer id, Carrinho obj){
        Carrinho entity = repository.getReferenceById(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(Carrinho entity, Carrinho obj) {
        entity.setStatus_carrinho(obj.getStatus_carrinho());
        entity.setData_atualizacao(obj.getData_atualizacao());

    }

}
