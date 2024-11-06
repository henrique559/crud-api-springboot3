package com.unip.safeEats.API.resources;

import com.unip.safeEats.API.entities.PedidoItem;
import com.unip.safeEats.API.services.PedidoItemServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/pedido_item")
public class PedidoItemResource {

    @Autowired
    PedidoItemServices service;

    @GetMapping
    public ResponseEntity<List<PedidoItem>> findAll(){
        List<PedidoItem> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<PedidoItem> findById(@PathVariable Integer id){
        PedidoItem usuario = service.findById(id);
        return ResponseEntity.ok().body(usuario);
    }

    @PostMapping
    public ResponseEntity<PedidoItem> insert(@RequestBody PedidoItem obj){
        obj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId_pedido_item()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<PedidoItem> update(@PathVariable Integer id, @RequestBody PedidoItem obj){
        obj = service.update(id, obj);
        return ResponseEntity.ok().body(obj);
    }
}


