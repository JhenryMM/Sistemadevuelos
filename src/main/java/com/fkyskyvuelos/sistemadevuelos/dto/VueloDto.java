package com.fkyskyvuelos.sistemadevuelos.dto;
import lombok.*;

import java.time.LocalDateTime;

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
