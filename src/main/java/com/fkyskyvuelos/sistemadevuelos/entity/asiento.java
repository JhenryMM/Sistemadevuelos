package com.fkyskyvuelos.sistemadevuelos.entity;


import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "asiento")
public class asiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAsiento")
    private Long id;

    private String nombre;
    private boolean disponible;
    private boolean reservado;

    // relaciones de entidades

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idVuelo", nullable = false)
    private com.fkyskyvuelos.sistemadevuelos.entity.vuelo vuelo;

    @OneToOne(mappedBy = "asiento")
    private usuario usuario;

}