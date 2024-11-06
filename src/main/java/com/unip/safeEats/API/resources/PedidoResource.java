package com.unip.safeEats.API.resources;

import com.unip.safeEats.API.entities.Pedido;
import com.unip.safeEats.API.services.PedidoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/pedido")
public class PedidoResource {

    @Autowired
    PedidoServices service;

    @GetMapping
    public ResponseEntity<List<Pedido>> findAll(){
        List<Pedido> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Pedido> findById(@PathVariable Integer id){
        Pedido usuario = service.findById(id);
        return ResponseEntity.ok().body(usuario);
    }

    @PostMapping
    public ResponseEntity<Pedido> insert(@RequestBody Pedido obj){
        obj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getCod_pedido()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pedido> update(@PathVariable Integer id, @RequestBody Pedido obj){
        obj = service.update(id, obj);
        return ResponseEntity.ok().body(obj);
    }
}


