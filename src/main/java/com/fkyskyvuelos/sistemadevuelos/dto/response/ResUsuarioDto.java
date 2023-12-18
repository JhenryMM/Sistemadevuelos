package com.fkyskyvuelos.sistemadevuelos.dto.response;

import com.fkyskyvuelos.sistemadevuelos.entity.asiento;
import com.fkyskyvuelos.sistemadevuelos.entity.reserva;
import com.fkyskyvuelos.sistemadevuelos.entity.vuelo;
import lombok.*;

import java.util.Set;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class ResUsuarioDto {
    private String nombre;
    private String apellido;
    private Set<reserva> reservas;
}
