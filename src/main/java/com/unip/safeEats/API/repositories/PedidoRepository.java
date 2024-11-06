package com.unip.safeEats.API.repositories;

import com.unip.safeEats.API.entities.Pedido;
import com.unip.safeEats.API.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
}
