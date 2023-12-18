package com.fkyskyvuelos.sistemadevuelos.dto.response;

import com.fkyskyvuelos.sistemadevuelos.dto.request.ReqUsuarioDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SaveUserDto {
    private ReqUsuarioDto ReqUsuarioDto;

    private String message;
}
