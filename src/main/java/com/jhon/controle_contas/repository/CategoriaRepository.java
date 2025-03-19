package com.jhon.controle_contas.repository;

import com.jhon.controle_contas.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
