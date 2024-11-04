package com.unip.safeEats.API.resources;

import com.unip.safeEats.API.entities.Administrador;
import com.unip.safeEats.API.services.AdministradorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/administrador")
public class AdministradorResource {
    @Autowired
    AdministradorServices services;

    @GetMapping
    public ResponseEntity<List<Administrador>> findAll(){
        List<Administrador> administradores = services.findAll();
        return ResponseEntity.ok().body(administradores);
    }
}
