package com.unip.safeEats.API.resources;

import com.unip.safeEats.API.entities.ItemCarrinho;
import com.unip.safeEats.API.services.ItemCarrinhoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/item_carrinho")
public class ItemCarrinhoResource {

    @Autowired
     ItemCarrinhoServices service;

    @GetMapping
    public ResponseEntity<List<ItemCarrinho>> findAll(){
        List<ItemCarrinho> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ItemCarrinho> findById(@PathVariable Long id){
        ItemCarrinho item_carrinho = service.findById(id);
        return ResponseEntity.ok().body(item_carrinho);
    }
}


