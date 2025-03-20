package com.jhon.controle_contas.repository;

import com.jhon.controle_contas.model.Conta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaRepository extends JpaRepository<Conta, Long> {
}
