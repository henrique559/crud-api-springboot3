package com.unip.safeEats.API.config;

import com.unip.safeEats.API.entities.Usuario;
import com.unip.safeEats.API.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("API")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UsuarioRepository usuarioRepository;


    @Override
    public void run(String... args) throws Exception {
        Usuario u1 = new Usuario(null, "Pedro", "pedro@gmail.com", "aaaa");
        Usuario u2 = new Usuario(null, "Joao", "joao@gmail.com", "aaaa");

        usuarioRepository.saveAll(Arrays.asList(u1, u2));

    }
}
