package com.voluntariado.comedores.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="becado")
public class Becado {
    /*agregar atributos firstName, lastName, carrera, credito, fechaInicio, fechaFin*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="firstName" , nullable = false)
    private String firstName;

    @Column(name="lastName" , nullable = false)
    private String lastName;

    @Column(name="carrera" , nullable = false)
    private String carrera;

    @Column(name="credito" , nullable = false)
    private String credito;

    @Column(name="fechaInicio" , nullable = false)
    private String fechaInicio;

    @Column(name="fechaFin" , nullable = false)
    private String fechaFin;


}
