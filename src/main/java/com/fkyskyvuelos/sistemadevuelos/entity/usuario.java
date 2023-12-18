package com.fkyskyvuelos.sistemadevuelos.entity;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;


@Entity
@Getter
@Setter
@Table(name = "usuario")
public class usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUsuario")
    private Long id;

    private String nombre;
    private String apellido;
    private String nombredelvuelo;
    private String metodoDePago;

    // relaciones de entidades

    @ManyToMany(mappedBy = "reservadeusuarios")
    private Set<reserva> reservas;


    @OneToOne
    @JoinColumn(name = "idasiento", referencedColumnName = "idAsiento")
    private asiento asiento;

}