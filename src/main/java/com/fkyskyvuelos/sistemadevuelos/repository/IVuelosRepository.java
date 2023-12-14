package com.fkyskyvuelos.sistemadevuelos.repository;

import com.fkyskyvuelos.sistemadevuelos.entity.Vuelo;

import java.util.List;

public interface IVuelosRepository {
    Vuelo save(Vuelo vuelo);
    List<Vuelo> findAll();
}
