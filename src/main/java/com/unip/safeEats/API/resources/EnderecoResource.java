package com.unip.safeEats.API.resources;

import com.unip.safeEats.API.entities.Endereco;
import com.unip.safeEats.API.entities.Usuario;
import com.unip.safeEats.API.services.EnderecoServices;
import com.unip.safeEats.API.services.UsuarioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/endereco")
public class EnderecoResource {

    @Autowired
    EnderecoServices services;

    @GetMapping
    public ResponseEntity<List<Endereco>> findAll(){
        List<Endereco> enderecos = services.findAll();
        return ResponseEntity.ok().body(enderecos);
    }

}
