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

    // relaciones de entidades

    @ManyToMany(mappedBy = "vuelosUsuarios")
    private Set<vuelo> vuelos;

    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    @JoinColumn(name = "idasiento", referencedColumnName = "idAsiento")
    private asiento asiento;

}