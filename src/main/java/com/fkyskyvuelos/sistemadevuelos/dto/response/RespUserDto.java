package com.fkyskyvuelos.sistemadevuelos.dto.response;

import com.fkyskyvuelos.sistemadevuelos.dto.usuarioDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RespUserDto {
    private usuarioDto usuarioDto;
    private String message;
}
