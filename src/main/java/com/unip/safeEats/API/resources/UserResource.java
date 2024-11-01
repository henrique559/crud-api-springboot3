package com.unip.safeEats.API.resources;

import com.unip.safeEats.API.entities.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<Usuario> findAll(){
        Usuario u = new Usuario(1, "Maria", "maria@gmail.com", "1234");
        return ResponseEntity.ok().body(u);

    }
}
