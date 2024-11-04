package com.unip.safeEats.API.resources;

import com.unip.safeEats.API.entities.Cliente;
import com.unip.safeEats.API.services.ClienteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteResource {

    @Autowired
     ClienteServices services;

    @GetMapping
    public ResponseEntity<List<Cliente>> findAll(){
        List<Cliente> clientes = services.findAll();
        return ResponseEntity.ok().body(clientes);
    }

}
