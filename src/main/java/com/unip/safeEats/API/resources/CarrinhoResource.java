package com.unip.safeEats.API.resources;

import com.unip.safeEats.API.entities.Carrinho;
import com.unip.safeEats.API.services.CarrinhoCompraServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/carrinho_compra")
public class CarrinhoResource {

    @Autowired
    CarrinhoCompraServices service;

    @GetMapping
    public ResponseEntity<List<Carrinho>> findAll(){
        List<Carrinho> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Carrinho> findById(@PathVariable Integer id){
        Carrinho usuario = service.findById(id);
        return ResponseEntity.ok().body(usuario);
    }

    @PostMapping
    public ResponseEntity<Carrinho> insert(@RequestBody Carrinho obj){
        obj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId_carrinho()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Carrinho> update(@PathVariable Integer id, @RequestBody Carrinho obj){
        obj = service.update(id, obj);
        return ResponseEntity.ok().body(obj);
    }
}


