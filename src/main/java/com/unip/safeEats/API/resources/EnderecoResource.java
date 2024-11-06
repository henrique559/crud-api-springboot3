package com.unip.safeEats.API.resources;

import com.unip.safeEats.API.entities.Endereco;
import com.unip.safeEats.API.entities.Endereco;
import com.unip.safeEats.API.entities.Endereco;
import com.unip.safeEats.API.services.EnderecoServices;
import com.unip.safeEats.API.services.EnderecoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/endereco")
public class EnderecoResource {

    @Autowired
    EnderecoServices service;

    @GetMapping
    public ResponseEntity<List<Endereco>> findAll(){
        List<Endereco> enderecos = service.findAll();
        return ResponseEntity.ok().body(enderecos);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Endereco> findById(@PathVariable Integer id){
        Endereco usuario = service.findById(id);
        return ResponseEntity.ok().body(usuario);
    }

    @PostMapping
    public ResponseEntity<Endereco> insert(@RequestBody Endereco obj){
        obj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getIdEndereco()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Endereco> update(@PathVariable Integer id, @RequestBody Endereco obj){
        obj = service.update(id, obj);
        return ResponseEntity.ok().body(obj);
    }
}
