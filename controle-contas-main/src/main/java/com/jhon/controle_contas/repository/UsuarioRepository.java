package com.jhon.controle_contas.repository;

import com.jhon.controle_contas.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
