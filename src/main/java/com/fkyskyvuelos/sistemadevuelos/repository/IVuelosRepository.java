package com.fkyskyvuelos.sistemadevuelos.repository;

import com.fkyskyvuelos.sistemadevuelos.entity.vuelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface IVuelosRepository extends JpaRepository<vuelo,Long> {


}
