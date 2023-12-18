package com.fkyskyvuelos.sistemadevuelos.service;

import com.fkyskyvuelos.sistemadevuelos.dto.response.ResUsuarioDto;
import com.fkyskyvuelos.sistemadevuelos.dto.response.SaveUserDto;
import com.fkyskyvuelos.sistemadevuelos.dto.request.ReqUsuarioDto;

import java.util.List;


public interface IUsuarioService {
    SaveUserDto guardarCompra(ReqUsuarioDto usuario);
    List<ResUsuarioDto> obtenerTodos();
}
