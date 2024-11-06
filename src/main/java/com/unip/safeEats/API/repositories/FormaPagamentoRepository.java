package com.unip.safeEats.API.repositories;

import com.unip.safeEats.API.entities.Administrador;
import com.unip.safeEats.API.entities.FormaPagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormaPagamentoRepository extends JpaRepository<FormaPagamento, Integer> {
}
