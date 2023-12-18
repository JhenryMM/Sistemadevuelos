package com.fkyskyvuelos.sistemadevuelos.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ReqUsuarioDto {
    private String nombre;
    private String apellido;
    private String nombredelvuelo;
    private String metodoDePago;
}
