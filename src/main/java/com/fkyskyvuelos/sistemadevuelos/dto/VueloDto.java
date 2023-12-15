package com.fkyskyvuelos.sistemadevuelos.dto;

import com.fkyskyvuelos.sistemadevuelos.entity.asiento;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class VueloDto {


    private String nombredeVuelo;
    private LocalDateTime fechaDeSalida;
    private LocalDateTime fechaLlegada;
    private int precio;
    private int asientosDispo;
}
