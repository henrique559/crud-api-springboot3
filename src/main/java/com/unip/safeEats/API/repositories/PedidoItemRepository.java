package com.unip.safeEats.API.repositories;

import com.unip.safeEats.API.entities.Pedido;
import com.unip.safeEats.API.entities.PedidoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoItemRepository extends JpaRepository<PedidoItem, Integer> {
}
