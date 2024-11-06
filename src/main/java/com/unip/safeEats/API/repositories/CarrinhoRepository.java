package com.unip.safeEats.API.repositories;

import com.unip.safeEats.API.entities.Carrinho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarrinhoRepository extends JpaRepository<Carrinho, Integer> {
}
