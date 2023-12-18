package com.fkyskyvuelos.sistemadevuelos.repository;


import com.fkyskyvuelos.sistemadevuelos.entity.reserva;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IReservaRepository extends JpaRepository<reserva,Long> {
}
