package com.fkyskyvuelos.sistemadevuelos.entity;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Entity
@Getter
@Setter
@Table(name = "ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTicket")
    private Long id;


    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idVuelo", nullable = false)
    private Vuelo vuelo;



}