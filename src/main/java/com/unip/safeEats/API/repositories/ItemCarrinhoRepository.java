package com.unip.safeEats.API.repositories;

import com.unip.safeEats.API.entities.ItemCarrinho;
import com.unip.safeEats.API.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemCarrinhoRepository extends JpaRepository<ItemCarrinho, Integer> {
}
