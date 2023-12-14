package com.fkyskyvuelos.sistemadevuelos.entity;


import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "asiento")
public class Asiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAsiento")
    private Long id;

    private boolean disponible;
    private boolean reservado;

    // relaciones de entidades

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idVuelo", nullable = false)
    private Vuelo vuelo;

}