package com.unip.safeEats.API.repositories;

import com.unip.safeEats.API.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
