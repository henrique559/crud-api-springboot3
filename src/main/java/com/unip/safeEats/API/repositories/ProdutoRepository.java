package com.unip.safeEats.API.repositories;

import com.unip.safeEats.API.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}