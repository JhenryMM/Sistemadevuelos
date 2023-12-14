package com.fkyskyvuelos.sistemadevuelos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class VueloDto {
    private String nombredecompañia;
    private int[] asientos;
}
