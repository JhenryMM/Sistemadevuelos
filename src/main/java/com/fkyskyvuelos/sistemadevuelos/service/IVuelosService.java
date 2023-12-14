package com.fkyskyvuelos.sistemadevuelos.service;

import com.fkyskyvuelos.sistemadevuelos.dto.VueloDto;
import com.fkyskyvuelos.sistemadevuelos.dto.response.RespuestaDto;

import java.util.List;

public interface IVuelosService {
    RespuestaDto guardarReserva(VueloDto vuelo);

    List<VueloDto> buscarTodos();
}
