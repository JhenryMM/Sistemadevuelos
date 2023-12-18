package com.fkyskyvuelos.sistemadevuelos.repository;

import com.fkyskyvuelos.sistemadevuelos.dto.response.ResUsuarioDto;
import com.fkyskyvuelos.sistemadevuelos.entity.usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IUsuarioRepository extends JpaRepository<usuario,Long> {


}
