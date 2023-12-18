package com.fkyskyvuelos.sistemadevuelos.entity;


import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "asiento")
public class asiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAsiento")
    private Long id;
    private String nombredeAsiento;
    private boolean disponible;
    private boolean reservado;

    // relaciones de entidades

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idVuelo", nullable = false)
    private com.fkyskyvuelos.sistemadevuelos.entity.vuelo vuelo;

    @OneToOne(mappedBy = "asiento")
    private usuario usuario;


}