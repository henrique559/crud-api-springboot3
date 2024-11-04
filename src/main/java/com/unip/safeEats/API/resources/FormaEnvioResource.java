package com.unip.safeEats.API.resources;

import com.unip.safeEats.API.entities.FormaEnvio;
import com.unip.safeEats.API.entities.Fornecedor;
import com.unip.safeEats.API.services.FormaEnvioServices;
import com.unip.safeEats.API.services.FornecedorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/forma_envio")
public class FormaEnvioResource {
    @Autowired
    FormaEnvioServices services;

    @GetMapping
    public ResponseEntity<List<FormaEnvio>> findAll(){
        List<FormaEnvio> formaEnvio = services.findAll();
        return ResponseEntity.ok().body(formaEnvio );
    }
}
