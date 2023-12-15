package com.fkyskyvuelos.sistemadevuelos.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class asientoDto {
    private String nombre;
    private boolean disponible;
    private boolean reservado;
}
