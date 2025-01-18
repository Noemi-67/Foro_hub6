package com.forohub6.forohub6.repository;

import com.forohub6.forohub6.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}