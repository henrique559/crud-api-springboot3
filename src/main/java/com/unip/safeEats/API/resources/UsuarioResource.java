package com.unip.safeEats.API.resources;

import com.unip.safeEats.API.entities.Usuario;
import com.unip.safeEats.API.services.UsuarioServices;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioResource {

    @Autowired
    UsuarioServices service;

    @GetMapping
    public ResponseEntity<List<Usuario>> findAll(){
        List<Usuario> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Usuario> findById(@PathVariable Integer id){
        Usuario usuario = service.findById(id);
        return ResponseEntity.ok().body(usuario);
    }

    @PostMapping
    public ResponseEntity<Usuario> insert(@RequestBody Usuario obj){
        obj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getIdUsuario()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Usuario> update(@PathVariable Integer id, @RequestBody Usuario obj){
        obj = service.update(id, obj);
        return ResponseEntity.ok().body(obj);

    }
}


