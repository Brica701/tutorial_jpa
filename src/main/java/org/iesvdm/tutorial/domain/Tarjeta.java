package org.iesvdm.tutorial.domain;

import jakarta.persistence.*;
import org.iesvdm.tutorial.domain.Socio;

@Entity
public class Tarjeta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numero;

    @OneToOne(mappedBy = "tarjeta")
    private Socio socio;

    // Getters y Setters
}
