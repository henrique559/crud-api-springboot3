package com.unip.safeEats.API.services;

import com.unip.safeEats.API.entities.ItemCarrinho;
import com.unip.safeEats.API.repositories.ItemCarrinhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemCarrinhoServices {

    @Autowired
    private ItemCarrinhoRepository  repository;

    public List<ItemCarrinho> findAll(){
        return repository.findAll();
    }

    public ItemCarrinho findById(Integer id){
        Optional<ItemCarrinho> obj =  repository.findById(id);
        return obj.get();

    }

}
