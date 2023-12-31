package com.fkyskyvuelos.sistemadevuelos.entity;
import lombok.*;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "vuelo")
public class vuelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idVuelo")
    private Long id;

    @Column(name="nombredeVuelo",length = 60)
    private String nombredeVuelo;

    private LocalDateTime fechaDeSalida;
    private LocalDateTime fechaLlegada;
    private int precio;

    // relaciones de entidades

    @OneToMany(mappedBy = "vuelo", cascade = CascadeType.ALL)
    private Set<asiento> asientos;

}
