package com.unip.safeEats.API.resources;

import com.unip.safeEats.API.entities.Fornecedor;
import com.unip.safeEats.API.services.FornecedorServices;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/fornecedor")
public class FornecedorResource {
    @Autowired
    FornecedorServices services;

    @GetMapping
    public ResponseEntity<List<Fornecedor>> findAll(){
        List<Fornecedor> fornecedores = services.findAll();
        return ResponseEntity.ok().body(fornecedores);

    }


}
