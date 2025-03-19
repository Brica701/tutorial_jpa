package org.iesvdm.tutorial.domain;

import jakarta.persistence.*;

@Entity
public class Socio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @OneToOne(mappedBy = "socio", cascade = CascadeType.ALL)
    private Tarjeta tarjeta;

    // Getters y Setters
}
