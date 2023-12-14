package com.fkyskyvuelos.sistemadevuelos.entity;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;


@Entity
@Getter
@Setter
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUsuario")
    private Long id;

    private String nombre;
    private String apellido;

    // relaciones de entidades

    @OneToMany
    private Set<Ticket> tickets;


    @ManyToMany(mappedBy = "vuelosUsuarios")
    private Set<Vuelo> vuelos;

}