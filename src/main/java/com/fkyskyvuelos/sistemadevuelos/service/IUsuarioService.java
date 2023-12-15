package com.fkyskyvuelos.sistemadevuelos.service;

import com.fkyskyvuelos.sistemadevuelos.dto.response.RespUserDto;
import com.fkyskyvuelos.sistemadevuelos.dto.usuarioDto;


public interface IUsuarioService {
    RespUserDto guardarCompra(usuarioDto usuario);
}
