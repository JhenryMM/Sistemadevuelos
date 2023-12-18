package com.fkyskyvuelos.sistemadevuelos.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "reserva")
public class reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idreserva")
    private Long id;

    private String nombreDelUser;

    @ManyToMany
    @JoinTable(
            name = "reser_user",
            joinColumns = @JoinColumn(name = "idreserva"),
            inverseJoinColumns = @JoinColumn (name = "idUsuario")
    )
    private Set<usuario> reservadeusuarios;


}
