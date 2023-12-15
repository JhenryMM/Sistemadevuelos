package com.fkyskyvuelos.sistemadevuelos.service;

import com.fkyskyvuelos.sistemadevuelos.dto.VueloDto;

import java.util.List;

public interface IVuelosService {

    List<VueloDto> buscarTodos();
}
