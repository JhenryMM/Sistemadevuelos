package com.fkyskyvuelos.sistemadevuelos.repository;

import com.fkyskyvuelos.sistemadevuelos.entity.usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepository extends JpaRepository<usuario,Long> {
}
