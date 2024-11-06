package com.unip.safeEats.API.resources;

import com.unip.safeEats.API.entities.Produto;
import com.unip.safeEats.API.entities.Produto;
import com.unip.safeEats.API.services.ProdutoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoResource {

    @Autowired
    private ProdutoServices service;

    @GetMapping
    public ResponseEntity<List<Produto>> findAll(){
        return ResponseEntity.ok().body(service.findAll());
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Produto> findById(@PathVariable Integer id){
        Produto usuario = service.findById(id);
        return ResponseEntity.ok().body(usuario);
    }

    @PostMapping
    public ResponseEntity<Produto> insert(@RequestBody Produto obj){
        obj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId_produto()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Produto> update(@PathVariable Integer id, @RequestBody Produto obj){
        obj = service.update(id, obj);
        return ResponseEntity.ok().body(obj);
    }

}
